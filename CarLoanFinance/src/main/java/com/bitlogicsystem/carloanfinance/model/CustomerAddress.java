package com.bitlogicsystem.carloanfinance.model;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

public class CustomerAddress 
{
	private int customerAddressId;
	@OneToOne(cascade = CascadeType.ALL)
	private PermanentAddress permanentAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private LocalAddress localAddress;
}
