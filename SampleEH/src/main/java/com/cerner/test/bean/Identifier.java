package com.cerner.test.bean;

public class Identifier {

	private String typeCode;
	
	private int value;
	
	
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Identifier [typeCode=" + typeCode + ", value=" + value + "]";
	}

	
	
}
