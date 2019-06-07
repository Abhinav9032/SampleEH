package com.cerner.test.bean;

import java.util.ArrayList;

public class RequestTransaction {

	private ArrayList<Transaction> transactions;

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "RequestTransaction [transactions=" + transactions.get(0) + "]";
	}
	
	
	
}
