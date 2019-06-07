package com.cerner.test.bean;

public class Benefit {

	private String typeCode;
	private String monetaryAmount;
	private String percent;
	private String periodTypeCode;
	private String quantityTypeCode;
	private String quantity;

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getMonetaryAmount() {
		return monetaryAmount;
	}

	public void setMonetaryAmount(String monetaryAmount) {
		this.monetaryAmount = monetaryAmount;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	public String getPeriodTypeCode() {
		return periodTypeCode;
	}

	public void setPeriodTypeCode(String periodTypeCode) {
		this.periodTypeCode = periodTypeCode;
	}

	public String getQuantityTypeCode() {
		return quantityTypeCode;
	}

	public void setQuantityTypeCode(String quantityTypeCode) {
		this.quantityTypeCode = quantityTypeCode;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Benifit [typeCode=" + typeCode + ", monetaryAmount=" + monetaryAmount + ", percent=" + percent
				+ ", periodTypeCode=" + periodTypeCode + ", quantityTypeCode=" + quantityTypeCode + ", quantity="
				+ quantity + "]";
	}

}
