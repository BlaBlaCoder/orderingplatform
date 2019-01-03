package com.ordering.platform.processor.context;

public class ContextImpl implements Context {

	private String s;

	@Override
	public void setFailure(String s) {
		this.s = s;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFailure() {
		// TODO Auto-generated method stub
		return s;
	}

}
