package digital.metro.tom.slim.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;
import java.util.Set;

@JsonIgnoreProperties( ignoreUnknown = true )
public class Stop implements StopIdInterface {
    private String customerId;
    private String addressId;

    private Set<String> orderIds;

    public Stop() {
    }

    public Stop( final String customerId, final String addressId, final Set<String> orderIds ) {
        this.customerId = customerId;
        this.addressId = addressId;
        this.orderIds = orderIds;
    }

    @Override
    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String getAddressId() {
        return addressId;
    }

    public Set<String> getOrderIds() {
        return orderIds;
    }


    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        final Stop that = (Stop) o;
        return Objects.equals( customerId, that.customerId ) &&
                Objects.equals( addressId, that.addressId ) &&
                Objects.equals( orderIds, that.orderIds );
    }

    @Override
    public int hashCode() {
        return Objects.hash( customerId, addressId, orderIds );
    }
}
