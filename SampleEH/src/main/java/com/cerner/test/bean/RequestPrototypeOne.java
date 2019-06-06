package com.cerner.test.bean;

import java.util.Date;

public class RequestPrototypeOne {

	private String pureText;

	private String alphaNumeric;

	private int maxLimitFiveK;

	private long tenDigitPhoneNumber;

	private Date onlyPastDate;

	private Date onlyFutureDate;

	public String getPureText() {
		return pureText;
	}

	public void setPureText(String pureText) {
		this.pureText = pureText;
	}

	public String getAlphaNumeric() {
		return alphaNumeric;
	}

	public void setAlphaNumeric(String alphaNumeric) {
		this.alphaNumeric = alphaNumeric;
	}

	public int getMaxLimitFiveK() {
		return maxLimitFiveK;
	}

	public void setMaxLimitFiveK(int maxLimitFiveK) {
		this.maxLimitFiveK = maxLimitFiveK;
	}

	public long getTenDigitPhoneNumber() {
		return tenDigitPhoneNumber;
	}

	public void setTenDigitPhoneNumber(long tenDigitPhoneNumber) {
		this.tenDigitPhoneNumber = tenDigitPhoneNumber;
	}

	public Date getOnlyPastDate() {
		return onlyPastDate;
	}

	public void setOnlyPastDate(Date onlyPastDate) {
		this.onlyPastDate = onlyPastDate;
	}

	public Date getOnlyFutureDate() {
		return onlyFutureDate;
	}

	public void setOnlyFutureDate(Date onlyFutureDate) {
		this.onlyFutureDate = onlyFutureDate;
	}

	@Override
	public String toString() {
		return "RequestPrototypeOne [pureText=" + pureText + ", alphaNumeric=" + alphaNumeric + ", maxLimitFiveK="
				+ maxLimitFiveK + ", tenDigitPhoneNumber=" + tenDigitPhoneNumber + ", onlyPastDate=" + onlyPastDate
				+ ", onlyFutureDate=" + onlyFutureDate + "]";
	}

}
