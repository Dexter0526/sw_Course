package com.exam.domain;

import lombok.Data;

@Data
public class Criteria {
	
	private int pageNum;
	private int amount;
	private int startRow;
	
	public Criteria() {
		this(1, 10);
	}

	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
		//this.startRow = (this.pageNum - 1) * this.amount + 1; // Oracle 기준
		this.startRow = (this.pageNum - 1) * this.amount; // MySQL 기준
	}	
	
}
