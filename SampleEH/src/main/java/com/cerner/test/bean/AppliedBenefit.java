package com.cerner.test.bean;

import java.util.ArrayList;

public class AppliedBenefit {

	private String inHealthPlanNetworkCode;

	private String serviceTypeCode;

	private String authorizationRequiredCode;

	private String coverageLevelCode;

	private ArrayList<Benefit> benefits;

	public String getInHealthPlanNetworkCode() {
		return inHealthPlanNetworkCode;
	}

	public void setInHealthPlanNetworkCode(String inHealthPlanNetworkCode) {
		this.inHealthPlanNetworkCode = inHealthPlanNetworkCode;
	}

	public String getServiceTypeCode() {
		return serviceTypeCode;
	}

	public void setServiceTypeCode(String serviceTypeCode) {
		this.serviceTypeCode = serviceTypeCode;
	}

	public String getAuthorizationRequiredCode() {
		return authorizationRequiredCode;
	}

	public void setAuthorizationRequiredCode(String authorizationRequiredCode) {
		this.authorizationRequiredCode = authorizationRequiredCode;
	}

	public String getCoverageLevelCode() {
		return coverageLevelCode;
	}

	public void setCoverageLevelCode(String coverageLevelCode) {
		this.coverageLevelCode = coverageLevelCode;
	}

	public ArrayList<Benefit> getBenefits() {
		return benefits;
	}

	public void setBenefits(ArrayList<Benefit> benefits) {
		this.benefits = benefits;
	}

	@Override
	public String toString() {
		return "AppliedBenefit [inHealthPlanNetworkCode=" + inHealthPlanNetworkCode + ", serviceTypeCode="
				+ serviceTypeCode + ", authorizationRequiredCode=" + authorizationRequiredCode + ", coverageLevelCode="
				+ coverageLevelCode + ", benefits=" + benefits + "]";
	}

}
