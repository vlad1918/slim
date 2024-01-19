package digital.metro.tom.slim.models;

import java.time.Instant;
import java.util.Objects;

public class Period {
    private Type type;
    private Instant startTime;
    private Instant endTime;
    private StopDTO stop;

    //Use camelCase with Enum to work correctly with hipersistence library
    public enum Type {
        stopPeriod,
        drivingPeriod
    }

    public Period() {
    }

    public Period( final Type type, final Instant startTime, final Instant endTime ) {
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Period( final Type type, final Instant startTime, final Instant endTime, final StopDTO stop ) {
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.stop = stop;
    }

    public Type getType() {
        return type;
    }

    public void setType( final Type type ) {
        this.type = type;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime( final Instant startTime ) {
        this.startTime = startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime( final Instant endTime ) {
        this.endTime = endTime;
    }

    public StopDTO getStop() {
        return stop;
    }

    public void setStop( final StopDTO stop ) {
        this.stop = stop;
    }

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( !( o instanceof Period ) ) {
            return false;
        }
        final Period that = (Period) o;
        return Objects.equals( type, that.type ) && Objects.equals( startTime, that.startTime ) && Objects.equals( endTime, that.endTime ) && Objects.equals( stop, that.stop );
    }

    @Override
    public int hashCode() {
        return Objects.hash( type, startTime, endTime, stop );
    }
}
