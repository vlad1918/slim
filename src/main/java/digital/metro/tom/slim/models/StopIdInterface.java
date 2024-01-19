package digital.metro.tom.slim.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface StopIdInterface {

    String getCustomerId();
    String getAddressId();

    @JsonIgnore
    default StopId getStopId() {
        return new StopId( getCustomerId(), getAddressId() );
    }
}
