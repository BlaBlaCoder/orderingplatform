package com.ordering.platform.processor.orderstate;

import com.ordering.platform.processor.orderstate.exception.StateFailureException;

public interface StateManagement<V,T> {
	T process(V v) throws StateFailureException;
	String failedWithReason(Exception e);
}
