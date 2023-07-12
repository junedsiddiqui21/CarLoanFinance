package com.bitlogicsystem.carloanfinance.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

public class CibilScore 
{
	private int cibilid;
	private long cibilscore;
	@CreationTimestamp
	private Date cibilScoreDateTime;
	private String status;
	private String remark;
}
