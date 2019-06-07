package com.cerner.test.bean;

import java.util.ArrayList;

public class Transaction {

	private ArrayList<Identifier> identifiers;
	
	private String modifyModeIndicator;
	
	private String payerName;
	
	private String healthPlanName;
	
	private String defaultInHealthPlanNetworkCode;
	
	private String defaultServiceTypeCode;
	
	private String displayNameType;
	
	private Patient patient;
	
	private ArrayList<AppliedBenefit> appliedBenefits;

	public ArrayList<Identifier> getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(ArrayList<Identifier> identifiers) {
		this.identifiers = identifiers;
	}

	public String getModifyModeIndicator() {
		return modifyModeIndicator;
	}

	public void setModifyModeIndicator(String modifyModeIndicator) {
		this.modifyModeIndicator = modifyModeIndicator;
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getHealthPlanName() {
		return healthPlanName;
	}

	public void setHealthPlanName(String healthPlanName) {
		this.healthPlanName = healthPlanName;
	}

	public String getDefaultInHealthPlanNetworkCode() {
		return defaultInHealthPlanNetworkCode;
	}

	public void setDefaultInHealthPlanNetworkCode(String defaultInHealthPlanNetworkCode) {
		this.defaultInHealthPlanNetworkCode = defaultInHealthPlanNetworkCode;
	}

	public String getDefaultServiceTypeCode() {
		return defaultServiceTypeCode;
	}

	public void setDefaultServiceTypeCode(String defaultServiceTypeCode) {
		this.defaultServiceTypeCode = defaultServiceTypeCode;
	}

	public String getDisplayNameType() {
		return displayNameType;
	}

	public void setDisplayNameType(String displayNameType) {
		this.displayNameType = displayNameType;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public ArrayList<AppliedBenefit> getAppliedBenefits() {
		return appliedBenefits;
	}

	public void setAppliedBenefits(ArrayList<AppliedBenefit> appliedBenefits) {
		this.appliedBenefits = appliedBenefits;
	}

	@Override
	public String toString() {
		return "Transaction [identifiers=" + identifiers + ", modifyModeIndicator=" + modifyModeIndicator
				+ ", payerName=" + payerName + ", healthPlanName=" + healthPlanName
				+ ", defaultInHealthPlanNetworkCode=" + defaultInHealthPlanNetworkCode + ", defaultServiceTypeCode="
				+ defaultServiceTypeCode + ", displayNameType=" + displayNameType + ", patient=" + patient
				+ ", appliedBenefits=" + appliedBenefits + "]";
	}
	
	
}
