package com.ordering.platform.domain;

import java.math.BigDecimal;

public abstract class WalletRequest {
	
	private BigDecimal amount;
	private Long userId;
	private Long orderId;
	private Integer serviceType;
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	
	public abstract CRDBENUM getCrDb();

}
