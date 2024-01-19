package digital.metro.tom.slim.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties( ignoreUnknown = true )
public class StopDTO implements StopIdInterface {
    private String customerId;
    private String addressId;
    private List<String> orderIds;

    public StopDTO() {
    }

    public StopDTO( final String customerId, final String addressId, final List<String> orderIds ) {
        this.customerId = customerId;
        this.addressId = addressId;
        this.orderIds = orderIds;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId( final String customerId ) {
        this.customerId = customerId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId( final String addressId ) {
        this.addressId = addressId;
    }

    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds( final List<String> orderIds ) {
        this.orderIds = orderIds;
    }

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        final StopDTO stop = (StopDTO) o;
        return Objects.equals( customerId, stop.customerId ) && Objects.equals( addressId, stop.addressId ) && Objects.equals( orderIds, stop.orderIds );
    }

    @Override
    public int hashCode() {
        return Objects.hash( customerId, addressId, orderIds );
    }
}


