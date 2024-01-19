package digital.metro.tom.slim.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties( ignoreUnknown = true )
public class OptimizationForShipment {

    private String country;
    private String store;
    private String date;
    private String startTimeInstant;
    private String estEndTimeInstant;
    private String optimizationId;
    private String shipmentId;
    private Integer totalDistanceKm;
    private Integer netTotalDurationMin;
    private String optimizationSource;
    private List<Period> periods;
    private String optimizedAtInstant;

    public OptimizationForShipment() {
    }

    // CHECKSTYLE.OFF: ParameterNumber
    public OptimizationForShipment( final String country,
                                    final String store,
                                    final String date,
                                    final String startTimeInstant,
                                    final String estEndTimeInstant,
                                    final String optimizationId,
                                    final String shipmentId,
                                    final Integer totalDistanceKm,
                                    final Integer netTotalDurationMin,
                                    final String optimizationSource,
                                    final List<Period> periods,
                                    final String optimizedAtInstant ) {
        this.country = country;
        this.store = store;
        this.date = date;
        this.startTimeInstant = startTimeInstant;
        this.estEndTimeInstant = estEndTimeInstant;
        this.optimizationId = optimizationId;
        this.shipmentId = shipmentId;
        this.totalDistanceKm = totalDistanceKm;
        this.netTotalDurationMin = netTotalDurationMin;
        this.optimizationSource = optimizationSource;
        this.periods = periods;
        this.optimizedAtInstant = optimizedAtInstant;
    }
    // CHECKSTYLE.ON: ParameterNumber

    public String getCountry() {
        return country;
    }

    public String getStore() {
        return store;
    }

    public String getDate() {
        return date;
    }

    public String getStartTimeInstant() {
        return startTimeInstant;
    }

    public String getEstEndTimeInstant() {
        return estEndTimeInstant;
    }

    public String getOptimizationId() {
        return optimizationId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public Integer getTotalDistanceKm() {
        return totalDistanceKm;
    }

    public Integer getNetTotalDurationMin() {
        return netTotalDurationMin;
    }

    public String getOptimizationSource() {
        return optimizationSource;
    }

    public void setCountry( final String country ) {
        this.country = country;
    }

    public void setStore( final String store ) {
        this.store = store;
    }

    public void setDate( final String date ) {
        this.date = date;
    }

    public void setStartTimeInstant( final  String startTimeInstant ) {
        this.startTimeInstant = startTimeInstant;
    }

    public void setEstEndTimeInstant( final  String estEndTimeInstant ) {
        this.estEndTimeInstant = estEndTimeInstant;
    }

    public void setOptimizationId( final String optimizationId ) {
        this.optimizationId = optimizationId;
    }

    public void setShipmentId( final  String shipmentId ) {
        this.shipmentId = shipmentId;
    }

    public void setTotalDistanceKm( final Integer totalDistanceKm ) {
        this.totalDistanceKm = totalDistanceKm;
    }

    public void setNetTotalDurationMin( final Integer netTotalDurationMin ) {
        this.netTotalDurationMin = netTotalDurationMin;
    }

    public void setOptimizationSource( final String optimizationSource ) {
        this.optimizationSource = optimizationSource;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods( final List<Period> periods ) {
        this.periods = periods;
    }

    public String getOptimizedAtInstant() {
        return optimizedAtInstant;
    }

    public void setOptimizedAtInstant( final String optimizedAtInstant ) {
        this.optimizedAtInstant = optimizedAtInstant;
    }

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        final OptimizationForShipment that = (OptimizationForShipment) o;
        return country == that.country &&
                Objects.equals( store, that.store ) &&
                Objects.equals( date, that.date ) &&
                Objects.equals( startTimeInstant, that.startTimeInstant ) &&
                Objects.equals( estEndTimeInstant, that.estEndTimeInstant ) &&
                Objects.equals( optimizationId, that.optimizationId ) &&
                Objects.equals( shipmentId, that.shipmentId ) &&
                Objects.equals( totalDistanceKm, that.totalDistanceKm ) &&
                Objects.equals( netTotalDurationMin, that.netTotalDurationMin ) &&
                Objects.equals( optimizationSource, that.optimizationSource ) &&
                Objects.equals( periods, that.periods ) &&
                Objects.equals( optimizedAtInstant, that.optimizedAtInstant );
    }

    @Override
    public int hashCode() {
        return Objects.hash( country, store, date, startTimeInstant, estEndTimeInstant, optimizationId, shipmentId,
                totalDistanceKm, netTotalDurationMin, optimizationSource, periods, optimizedAtInstant );
    }

    @Override
    public String toString() {
        return "OptimizationForShipment{" +
                "country=" + country +
                ", store='" + store + '\'' +
                ", date='" + date + '\'' +
                ", startTimeInstant='" + startTimeInstant + '\'' +
                ", estEndTimeInstant='" + estEndTimeInstant + '\'' +
                ", optimizationId='" + optimizationId + '\'' +
                ", shipmentId='" + shipmentId + '\'' +
                ", totalDistanceKm=" + totalDistanceKm +
                ", netTotalDurationMin=" + netTotalDurationMin +
                ", optimizationSource='" + optimizationSource + '\'' +
                ", periods=" + periods +
                ", optimizedAtInstant='" + optimizedAtInstant + '\'' +
                '}';
    }
}
