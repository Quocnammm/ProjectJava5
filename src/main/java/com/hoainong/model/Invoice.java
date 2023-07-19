package com.hoainong.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "invoice")
public class Invoice {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer invoiceID;		
	@ManyToOne @JoinColumn(name = "userID")
	User user;
	@Temporal(TemporalType.DATE)
	@Column(name = "createDate")
	private Date createDate = new Date();
	@Column(name = "`address`")
	private String address	;
	@OneToMany(mappedBy = "invoice")
	List<InvoiceDetail> invoiceDetails;
	public Invoice(Integer invoiceID, User user, Date createDate, String address, List<InvoiceDetail> invoiceDetails) {
		super();
		this.invoiceID = invoiceID;
		this.user = user;
		this.createDate = createDate;
		this.address = address;
		this.invoiceDetails = invoiceDetails;
	}
	public Invoice() {
		super();
	}
	public Integer getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(Integer invoiceID) {
		this.invoiceID = invoiceID;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<InvoiceDetail> getInvoiceDetails() {
		return invoiceDetails;
	}
	public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}
	
	
}
