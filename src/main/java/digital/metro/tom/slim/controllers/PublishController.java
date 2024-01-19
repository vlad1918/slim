package digital.metro.tom.slim.controllers;

import digital.metro.tom.slim.clients.ShipmentClient;
import digital.metro.tom.slim.models.Shipment;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PublishController {

    private final ShipmentClient shipmentClient;

    public PublishController( final ShipmentClient shipmentClient ) {
        this.shipmentClient = shipmentClient;
    }

    @GetMapping( value = "/{country}/{store}", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Shipment> getTours( @RequestHeader MultiValueMap<String, String> headers,
                                    @PathVariable( "country" ) final String country,
                                    @PathVariable( "store" ) final String storeNumber,
                                    @RequestParam( value = "date" ) final String date,
                                    @RequestParam( value = "excludeUnplannedShipments", required = false ) final boolean excludeUnplannedShipments,
                                    @RequestParam( value = "includeOptimizations", required = false ) final boolean includeOptimizations
    ) {

        final String jwt = headers.getFirst( "jwt" );
        final String callTreeId = headers.getFirst( "calltreeid" );

        return shipmentClient.getShipmentsByDateRange( country, storeNumber, date, jwt, callTreeId, excludeUnplannedShipments, includeOptimizations );
    }

    @GetMapping( value = "/json", produces = MediaType.APPLICATION_JSON_VALUE )
    public String readBigJson() {

        InputStream inputStream = getClass().getResourceAsStream("/shipments.json");
        String text = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.joining("\n"));

        return "[" + text + ", " + text + ", " + text + ", " + text + ", " + text + ", " + "]" ;
    }

}
