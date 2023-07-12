package com.bitlogicsystem.carloanfinance.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

public class SanctionLetter 
{
	private int sanctionId;
	@CreationTimestamp
	private Date sanctionDate;
	private String applicantName;
	private long contactDetails;
	private double loanAmmountSanctioned;
	private String interestType;
	private double rateOfInterest;
	private int loanTenure;
	private double monthlyEmiAmmount;
	private String modeOfPayment;
	private String remarks;
	private String termCondition;
	private String status;
}
