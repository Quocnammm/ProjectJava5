package com.hoainong.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceStats {
	private Integer year;
    private Integer month;
    private Double totalAmount;
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public InvoiceStats(Integer year, Integer month, Double totalAmount) {
		super();
		this.year = year;
		this.month = month;
		this.totalAmount = totalAmount;
	}
	public InvoiceStats() {
		super();
	}
    
    
}
