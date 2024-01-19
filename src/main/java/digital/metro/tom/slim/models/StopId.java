package digital.metro.tom.slim.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties( ignoreUnknown = true )
public class StopId implements StopIdInterface {

    private String customerId;
    private String addressId;

    public StopId() {
    }

    public StopId( final String customerId, final String addressId ) {
        this.customerId = customerId;
        this.addressId = addressId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setCustomerId( final String customerId ) {
        this.customerId = customerId;
    }

    public void setAddressId( final String addressId ) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( !( o instanceof StopId ) ) {
            return false;
        }
        final StopId that = (StopId) o;
        return Objects.equals( getCustomerId(), that.getCustomerId() ) && Objects.equals( getAddressId(), that.getAddressId() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( getCustomerId(), getAddressId() );
    }

    @Override
    public String toString() {
        return "StopId{" +
                "customerId='" + customerId + '\'' +
                ", addressId='" + addressId + '\'' +
                '}';
    }
}
