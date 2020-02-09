package com.yhoboo;

public class BillingAction {

	private int amount;
	private int netbill;
	
	public BillingAction() {
		amount=0;
		netbill=0;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getNetbill() {
		return netbill;
	}

	public void setNetbill(int netbill) {
		this.netbill = netbill;
	}
	
	public String execute() {
		netbill= amount-(amount*10/100);
		return ("done");
	}
}
