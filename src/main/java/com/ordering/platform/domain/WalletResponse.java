package com.ordering.platform.domain;

public class WalletResponse extends WalletResponseBalance {

	private Long orderId;
	private Integer serviceType;
	private Integer crDbEnum;
	public Integer getCreditDebit() {
		return crDbEnum;
	}
	public void setCreditDebit(Integer crDbEnum) {
		this.crDbEnum = crDbEnum;
		
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getOrderId() {
		return this.orderId;
	}
	public Integer getServiceType() {
		return serviceType;
	}
	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}
}
