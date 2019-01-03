package com.ordering.platform.wallet.repository;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import com.ordering.platform.entity.Revisionable;

@Entity
public class Wallet implements Revisionable {
	@GeneratedValue
	@Id
	private Long id;

	@Column
	private BigDecimal amount;

	@RevisionNumber
	@GeneratedValue
	@Column
	private Integer revisionId;

	@RevisionTimestamp
	private long timestamp;

	@Column
	private Long orderId;
	@Column
	private Integer serviceType;

	@Column
	private Byte creditDebit;
	
	@Override
	public Integer getRevisionId() {
		return revisionId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public Byte getCreditDebit() {
		return creditDebit;
	}

	public void setCreditDebit(Byte creditDebit) {
		this.creditDebit = creditDebit;
	}
}
