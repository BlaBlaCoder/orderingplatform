package com.ordering.platform.domain;

public class Order implements Cloneable{

	private Long orderId;
	private Long serviceType;
	private Boolean isO2PostPaid;
	private Integer status;
	
	private Long productId;
	private Integer productType;
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getServiceType() {
		return serviceType;
	}

	public void setServiceType(Long serviceType) {
		this.serviceType = serviceType;
	}

	public Boolean getIsO2PostPaid() {
		return isO2PostPaid;
	}

	public void setIsO2PostPaid(Boolean isO2PostPaid) {
		this.isO2PostPaid = isO2PostPaid;
	}
	@Override
	public int hashCode() {
		return orderId.hashCode()+serviceType.hashCode()+isO2PostPaid.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Order object = (Order) obj;
		return orderId.equals(object.getOrderId()) && serviceType.equals(object.getServiceType())
				&& isO2PostPaid.equals(object.getIsO2PostPaid());
	}
	@Override
	public Object clone() {
	    try {
	        return super.clone();
	    } catch (Exception e) {
	        // either handle the exception or throw it
	        return null;
	    }
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getProductType() {
		return productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}
}
