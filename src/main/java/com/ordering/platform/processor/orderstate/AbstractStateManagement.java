package com.ordering.platform.processor.orderstate;

import com.ordering.platform.processor.context.Context;
import com.ordering.platform.processor.context.ContextWrapper;

public class AbstractStateManagement<V,T> implements StateManagement<V,T> {
   ContextWrapper<Context> contextWrapper;
	@Override
	public T process(V v) {
		try {
			return process(v);
		} catch (Exception e) {
			failedWithReason(e);
		}
		
		return (T)v;
	}

	@Override
	public String failedWithReason(Exception e)  {
		
		e.printStackTrace();
		contextWrapper.getContext().setFailure(e.getMessage());
		return e.getMessage();
	}

}
