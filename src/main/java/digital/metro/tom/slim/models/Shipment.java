package digital.metro.tom.slim.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties( ignoreUnknown = true )
public class Shipment {

    private String country;
    private String store;
    private String date;
    private String shipmentId;
    private int lqPoints;
    private Float weightInKg;
    private Float volumeInM3;

    private String routeName;
    private Map<String, OrderInfo> orderInfoMap;
    private ShipmentType shipmentType;
    private String startLocationId;
    private String startTime;
    private List<Stop> stops;
    private String truckNumber;
    private Double deliveryTransportGoodsCount;
    private String optimizationStatus;
    private String name;
    private String createdFromTransportationTourId;
    private Float weightDueToTGs;

    private String driver;
    private String loader;
    private String tourStatus;
    private boolean hasValidTourStatus = true;
    private Float manuallyAddedCost;
    private OptimizationForShipment optimization;

    public Shipment() {
        //empty constructor needed for Jackson
    }

    public String getCountry() {
        return country;
    }

    public void setCountry( final String country ) {
        this.country = country;
    }

    public String getStore() {
        return store;
    }

    public void setStore( final String store ) {
        this.store = store;
    }

    public String getDate() {
        return date;
    }

    public void setDate( final String date ) {
        this.date = date;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId( final String shipmentId ) {
        this.shipmentId = shipmentId;
    }

    public Float getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg( final Float weightInKg ) {
        this.weightInKg = weightInKg;
    }

    public Float getVolumeInM3() {
        return volumeInM3;
    }

    public void setVolumeInM3( final Float volumeInM3 ) {
        this.volumeInM3 = volumeInM3;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName( final String routeName ) {
        this.routeName = routeName;
    }

    public Map<String, OrderInfo> getOrderInfoMap() {
        return orderInfoMap;
    }

    public void setOrderInfoMap( final Map<String, OrderInfo> orderInfoMap ) {
        this.orderInfoMap = orderInfoMap;
    }

    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType( final ShipmentType shipmentType ) {
        this.shipmentType = shipmentType;
    }

    public String getStartLocationId() {
        return startLocationId;
    }

    public void setStartLocationId( final String startLocationId ) {
        this.startLocationId = startLocationId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime( final String startTime ) {
        this.startTime = startTime;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops( final List<Stop> stops ) {
        this.stops = stops;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber( final String truckNumber ) {
        this.truckNumber = truckNumber;
    }

    public Double getDeliveryTransportGoodsCount() {
        return deliveryTransportGoodsCount;
    }

    public void setDeliveryTransportGoodsCount( final Double deliveryTransportGoodsCount ) {
        this.deliveryTransportGoodsCount = deliveryTransportGoodsCount;
    }

    public String getOptimizationStatus() {
        return optimizationStatus;
    }

    public void setOptimizationStatus( final String optimizationStatus ) {
        this.optimizationStatus = optimizationStatus;
    }

    public int getLqPoints() {
        return lqPoints;
    }

    public void setLqPoints( final int lqPoints ) {
        this.lqPoints = lqPoints;
    }

    public String getName() {
        return name;
    }

    public void setName( final String name ) {
        this.name = name;
    }

    public String getCreatedFromTransportationTourId() {
        return createdFromTransportationTourId;
    }

    public void setCreatedFromTransportationTourId( final String createdFromTransportationTourId ) {
        this.createdFromTransportationTourId = createdFromTransportationTourId;
    }

    public Float getWeightDueToTGs() {
        return weightDueToTGs;
    }

    public void setWeightDueToTGs( final Float weightDueToTGs ) {
        this.weightDueToTGs = weightDueToTGs;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver( final String driver ) {
        this.driver = driver;
    }

    public String getLoader() {
        return loader;
    }

    public void setLoader( final String loader ) {
        this.loader = loader;
    }

    public String getTourStatus() {
        return tourStatus;
    }

    public void setTourStatus( final String tourStatus ) {
        this.tourStatus = tourStatus;
    }

    public boolean getHasValidTourStatus() {
        return hasValidTourStatus;
    }

    public void setHasValidTourStatus( final boolean hasValidTourStatus ) {
        this.hasValidTourStatus = hasValidTourStatus;
    }

    public Float getManuallyAddedCost() {
        return manuallyAddedCost;
    }

    public void setManuallyAddedCost( final Float manuallyAddedCost ) {
        this.manuallyAddedCost = manuallyAddedCost;
    }

    public OptimizationForShipment getOptimization() {
        return optimization;
    }

    public void setOptimization( final OptimizationForShipment optimization ) {
        this.optimization = optimization;
    }

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        final Shipment shipment = (Shipment) o;
        return lqPoints == shipment.lqPoints &&
                Objects.equals( country, shipment.country ) &&
                Objects.equals( store, shipment.store ) &&
                Objects.equals( date, shipment.date ) &&
                Objects.equals( shipmentId, shipment.shipmentId ) &&
                Objects.equals( weightInKg, shipment.weightInKg ) &&
                Objects.equals( volumeInM3, shipment.volumeInM3 ) &&
                Objects.equals( routeName, shipment.routeName ) &&
                Objects.equals( orderInfoMap, shipment.orderInfoMap ) &&
                shipmentType == shipment.shipmentType &&
                Objects.equals( startLocationId, shipment.startLocationId ) &&
                Objects.equals( startTime, shipment.startTime ) &&
                Objects.equals( stops, shipment.stops ) &&
                Objects.equals( truckNumber, shipment.truckNumber ) &&
                Objects.equals( deliveryTransportGoodsCount, shipment.deliveryTransportGoodsCount ) &&
                Objects.equals( optimizationStatus, shipment.optimizationStatus ) &&
                Objects.equals( name, shipment.name ) &&
                Objects.equals( createdFromTransportationTourId, shipment.createdFromTransportationTourId ) &&
                Objects.equals( weightDueToTGs, shipment.weightDueToTGs ) &&
                Objects.equals( driver, shipment.driver ) &&
                Objects.equals( tourStatus, shipment.tourStatus ) &&
                Objects.equals( loader, shipment.loader ) &&
                Objects.equals( optimization, shipment.optimization ) &&
                Objects.equals( manuallyAddedCost, shipment.manuallyAddedCost );
    }

    @Override
    public int hashCode() {
        return Objects.hash( country, store, date, shipmentId, lqPoints, weightInKg, volumeInM3,
                routeName, orderInfoMap, shipmentType, startLocationId, startTime, stops,
                truckNumber, deliveryTransportGoodsCount, optimizationStatus, name, createdFromTransportationTourId,
                weightDueToTGs, driver, loader, tourStatus, hasValidTourStatus, manuallyAddedCost, optimization );
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "country='" + country + '\'' +
                ", store='" + store + '\'' +
                ", date='" + date + '\'' +
                ", shipmentId='" + shipmentId + '\'' +
                ", lqPoints=" + lqPoints +
                ", weightInKg=" + weightInKg +
                ", volumeInM3=" + volumeInM3 +
                ", routeName='" + routeName + '\'' +
                ", orderInfoMap=" + orderInfoMap +
                ", shipmentType=" + shipmentType +
                ", startLocationId='" + startLocationId + '\'' +
                ", startTime='" + startTime + '\'' +
                ", stops=" + stops +
                ", truckNumber='" + truckNumber + '\'' +
                ", deliveryTransportGoodsCount=" + deliveryTransportGoodsCount +
                ", optimizationStatus='" + optimizationStatus + '\'' +
                ", name='" + name + '\'' +
                ", createdFromTransportationTourId='" + createdFromTransportationTourId + '\'' +
                ", weightDueToTGs=" + weightDueToTGs +
                ", driver='" + driver + '\'' +
                ", loader='" + loader + '\'' +
                ", tourStatus='" + tourStatus + '\'' +
                ", hasValidTourStatus='" + hasValidTourStatus + '\'' +
                ", optimization=" + optimization + '\'' +
                ", manuallyAddedCost='" + manuallyAddedCost +
                '}';
    }
}
