package digital.metro.tom.slim.clients;

import digital.metro.tom.slim.models.Shipment;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Component
public class ShipmentClient {
    private final WebClient webClient;

    @Autowired
    public ShipmentClient( final WebClient webClient ) {
        this.webClient = webClient;
    }

    public List<Shipment> getShipmentsByDateRange( final String country,
                                                   final String store,
                                                   final String date,
                                                   final String jwt,
                                                   final String callTreeId,
                                                   final boolean excludeUnplannedShipments,
                                                   final boolean includeOptimizations ) {
        final URI uri = buildShipmentsUri( country, store, date, excludeUnplannedShipments, includeOptimizations );

        return webClient.method( HttpMethod.GET )
                .uri( uri )
                .header( "JWT", jwt )
                .header( "CallTreeId", callTreeId )
                .retrieve()
                .bodyToMono( new ParameterizedTypeReference<List<Shipment>>() {
                } )
                .block();

    }

    private URI buildShipmentsUri( final String country, final String store, final String date, final boolean excludeUnplannedShipments, final boolean includeOptimizations ) {
        return UriComponentsBuilder.fromHttpUrl( "http://transportation-prod.cf-transporta-live-79.cf.metro.cloud/transportation.planningservice.v1" )
                .pathSegment( "shipments", country, store )
                .queryParam( "dateFrom", date )
                .queryParam( "dateTo", date )
                .queryParam( "excludeUnplannedShipments", excludeUnplannedShipments )
                .queryParam( "includeOptimizations", includeOptimizations )
                .build()
                .toUri();
    }
}
