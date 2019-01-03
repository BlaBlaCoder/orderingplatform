package com.ordering.platform.domain;

import java.math.BigDecimal;

public class WalletResponseBalance {
	private BigDecimal amount;
	private Long userId;
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

	
}
