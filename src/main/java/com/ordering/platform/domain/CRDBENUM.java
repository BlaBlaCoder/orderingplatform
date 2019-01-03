package com.ordering.platform.domain;

public enum CRDBENUM {
	CR(1), DB(2), CK(3);

	private Integer val;

	private CRDBENUM(Integer val) {
		this.val = val;
	}

	public Integer getVal() {
		return val;
	}
	public static CRDBENUM valueOf(Integer value) {
		for(CRDBENUM val:values()) {
			if(val.getVal().equals(value)) {
				return val;
			}
		}
		return null;
	}
}
