package com.hoainong.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "invoiceDetail")
public class InvoiceDetail {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer detailID;		
	@Column(name = "price")
	private Double price;
	@Column(name = "quantity")
	private Integer quantity;
	@Column(name = "total")
	private Double total;
	@ManyToOne @JoinColumn(name = "invoiceID")
	Invoice invoice;
	@ManyToOne @JoinColumn(name = "productID")
	Product product;
	public Integer getDetailID() {
		return detailID;
	}
	public void setDetailID(Integer detailID) {
		this.detailID = detailID;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public InvoiceDetail(Integer detailID, Double price, Integer quantity, Double total, Invoice invoice,
			Product product) {
		super();
		this.detailID = detailID;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.invoice = invoice;
		this.product = product;
	}
	public InvoiceDetail() {
		super();
	}
	
	
}
