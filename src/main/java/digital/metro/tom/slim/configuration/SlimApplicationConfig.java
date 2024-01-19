package digital.metro.tom.slim.configuration;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;
import reactor.netty.tcp.TcpClient;

@Configuration
@EnableAutoConfiguration
public class SlimApplicationConfig {

    @Primary
    @Bean
    public WebClient webClient( ) {
        final TcpClient tcpClient = buildTcpClient( 40000 );

        return buildWebClient( tcpClient );

    }

    private TcpClient buildTcpClient( final int connectTimeoutMillis ) {
        return TcpClient.create()
                .option( ChannelOption.CONNECT_TIMEOUT_MILLIS, connectTimeoutMillis )
                .doOnConnected( connection -> connection.addHandlerLast( new ReadTimeoutHandler( connectTimeoutMillis ) )
                        .addHandlerLast( new WriteTimeoutHandler( connectTimeoutMillis ) ) );
    }

    private WebClient buildWebClient( final TcpClient tcpClient ) {
        return WebClient.builder()
                .exchangeStrategies( ExchangeStrategies.builder()
                        .codecs( configurer -> configurer
                                .defaultCodecs()
                                .maxInMemorySize( -1 ) )
                        .build() )
                .clientConnector( new ReactorClientHttpConnector( HttpClient.from( tcpClient ).wiretap( true ) ) )
                .build();
    }

}