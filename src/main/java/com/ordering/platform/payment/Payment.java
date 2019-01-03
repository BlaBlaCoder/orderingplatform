package com.ordering.platform.payment;

public interface Payment<T,V> {
public V pay(T v);
}
