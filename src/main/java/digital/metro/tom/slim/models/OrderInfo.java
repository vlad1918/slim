package digital.metro.tom.slim.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties( ignoreUnknown = true )
public class OrderInfo implements StopIdInterface{
    private String orderId;
    private String orderNumber;
    private Float outerTransportGoodCount;
    private String addressId;
    private String customerId;
    private OrderStatus status;
    private Float volumeInM3;
    private Float weightInKg;
    private Float lqPoints;
    private Float lqRelevantWeight;
    private Double orderNetValue;
    private String deliveryComment;
    private String customerOrderComment;
    private String originalRouteName;
    private OrderSource orderSource;
    private String uitCode;

    //CHECKSTYLE.OFF: ParameterNumber
    public OrderInfo( final String orderId,
                      final String orderNumber,
                      final Float outerTransportGoodCount,
                      final String addressId,
                      final String customerId,
                      final OrderStatus status,
                      final Float volumeInM3,
                      final Float weightInKg,
                      final Float lqPoints,
                      final Float lqRelevantWeight,
                      final Double orderNetValue,
                      final String deliveryComment,
                      final String customerOrderComment,
                      final String originalRouteName,
                      final OrderSource orderSource,
                      final String uitCode ) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.outerTransportGoodCount = outerTransportGoodCount;
        this.addressId = addressId;
        this.customerId = customerId;
        this.status = status;
        this.volumeInM3 = volumeInM3;
        this.weightInKg = weightInKg;
        this.lqPoints = lqPoints;
        this.lqRelevantWeight = lqRelevantWeight;
        this.orderNetValue = orderNetValue;
        this.deliveryComment = deliveryComment;
        this.customerOrderComment = customerOrderComment;
        this.originalRouteName = originalRouteName;
        this.orderSource = orderSource;
        this.uitCode = uitCode;
    }
    //CHECKSTYLE.ON: ParameterNumber

    public OrderInfo() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId( final String orderId ) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber( final String orderNumber ) {
        this.orderNumber = orderNumber;
    }

    public Float getOuterTransportGoodCount() {
        return outerTransportGoodCount;
    }

    public void setOuterTransportGoodCount( final Float outerTransportGoodCount ) {
        this.outerTransportGoodCount = outerTransportGoodCount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus( final OrderStatus status ) {
        this.status = status;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId( final String addressId ) {
        this.addressId = addressId;
    }

    public Float getVolumeInM3() {
        return volumeInM3;
    }

    public void setVolumeInM3( final Float volumeInM3 ) {
        this.volumeInM3 = volumeInM3;
    }

    public Float getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg( final Float weightInKg ) {
        this.weightInKg = weightInKg;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId( final String customerId ) {
        this.customerId = customerId;
    }

    public Float getLqPoints() {
        return lqPoints;
    }

    public void setLqPoints( final Float lqPoints ) {
        this.lqPoints = lqPoints;
    }

    public Float getLqRelevantWeight() {
        return lqRelevantWeight;
    }

    public void setLqRelevantWeight( final Float lqRelevantWeight ) {
        this.lqRelevantWeight = lqRelevantWeight;
    }

    public Double getOrderNetValue() {
        return orderNetValue;
    }

    public void setOrderNetValue( final Double orderNetValue ) {
        this.orderNetValue = orderNetValue;
    }

    public String getDeliveryComment() {
        return deliveryComment;
    }

    public void setDeliveryComment( final String deliveryComment ) {
        this.deliveryComment = deliveryComment;
    }

    public String getCustomerOrderComment() {
        return customerOrderComment;
    }

    public void setCustomerOrderComment( final String customerOrderComment ) {
        this.customerOrderComment = customerOrderComment;
    }

    public String getOriginalRouteName() {
        return originalRouteName;
    }

    public void setOriginalRouteName( final String originalRouteName ) {
        this.originalRouteName = originalRouteName;
    }

    public OrderSource getOrderSource() {
        return orderSource;
    }

    public void setOrderSource( final OrderSource orderSource ) {
        this.orderSource = orderSource;
    }

    public String getUitCode() {
        return uitCode;
    }

    public void setUitCode( final String uitCode ) {
        this.uitCode = uitCode;
    }

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        final OrderInfo orderInfo = (OrderInfo) o;
        return Objects.equals( orderId, orderInfo.orderId ) &&
                Objects.equals( orderNumber, orderInfo.orderNumber ) &&
                Objects.equals( outerTransportGoodCount, orderInfo.outerTransportGoodCount ) &&
                Objects.equals( addressId, orderInfo.addressId ) &&
                Objects.equals( customerId, orderInfo.customerId ) &&
                status == orderInfo.status &&
                Objects.equals( volumeInM3, orderInfo.volumeInM3 ) &&
                Objects.equals( weightInKg, orderInfo.weightInKg ) &&
                Objects.equals( lqPoints, orderInfo.lqPoints ) &&
                Objects.equals( lqRelevantWeight, orderInfo.lqRelevantWeight ) &&
                Objects.equals( orderNetValue, orderInfo.orderNetValue ) &&
                Objects.equals( deliveryComment, orderInfo.deliveryComment ) &&
                Objects.equals( customerOrderComment, orderInfo.customerOrderComment ) &&
                Objects.equals( originalRouteName, orderInfo.originalRouteName ) &&
                Objects.equals( orderSource, orderInfo.orderSource ) &&
                Objects.equals( uitCode, orderInfo.uitCode );
    }

    @Override
    public int hashCode() {
        return Objects.hash( orderId, orderNumber, outerTransportGoodCount, addressId, customerId, status, volumeInM3, weightInKg,
                lqPoints, lqRelevantWeight, orderNetValue, deliveryComment, customerOrderComment, originalRouteName, orderSource,
                uitCode );
    }
}