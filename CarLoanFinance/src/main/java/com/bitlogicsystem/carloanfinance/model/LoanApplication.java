package com.bitlogicsystem.carloanfinance.model;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

public class LoanApplication 
{	 
	private int customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerGender;
	private String customerDateOfBirth;
	private int customerAge;	
	private String customerEmail;
	private long customerMobileNumber;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private Profession profession;
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDetails loandetails;
	@OneToOne(cascade = CascadeType.ALL)
	private Documents documents;
	@OneToOne(cascade = CascadeType.ALL)
	private CibilScore cibilscore;
	@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter sanctionLetter;
}
