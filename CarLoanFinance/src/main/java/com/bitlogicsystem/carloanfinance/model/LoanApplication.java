package com.bitlogicsystem.carloanfinance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class LoanApplication {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 
	private int customerId;
	private String customerName;
	private String customerLastName;
	private String customerDateOfBirth;
	private int customerAge;
	private String customerGender;
	private String customerEmail;
	private long customerMobileNumber;
	private long customerAdditionalMobileNumber;
	private double customerAmountPaidForCar;
	private double customerTotalLoanRequired;


}
