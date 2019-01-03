package com.ordering.platform.payment;

public interface MerchantService<T,V>{

	public V blockCreditRequest(T object);
	public V releaseCreditRequest(T object);

}
