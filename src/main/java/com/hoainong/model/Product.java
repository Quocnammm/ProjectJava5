package com.hoainong.model;

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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productID;
	@Column(name = "`name`")
	private String name;	
	@Column(name = "`description`")
	private String description;	
	@Column(name = "price")
	private Double price;	
	@Column(name = "available")
	private Boolean available;
	@Column(name = "`image`")
	private String image;	
	@ManyToOne @JoinColumn(name = "categoryID")
	Category category;	
	@ManyToOne @JoinColumn(name = "brandID")
	Brand brand;
	@OneToMany(mappedBy = "product")
	List<InvoiceDetail> invoiceDetails;
	@OneToMany(mappedBy = "product")
	List<Gallery> galleries;
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public List<InvoiceDetail> getInvoiceDetails() {
		return invoiceDetails;
	}
	public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}
	public List<Gallery> getGalleries() {
		return galleries;
	}
	public void setGalleries(List<Gallery> galleries) {
		this.galleries = galleries;
	}
	public Product(Integer productID, String name, String description, Double price, Boolean available, String image,
			Category category, Brand brand, List<InvoiceDetail> invoiceDetails, List<Gallery> galleries) {
		super();
		this.productID = productID;
		this.name = name;
		this.description = description;
		this.price = price;
		this.available = available;
		this.image = image;
		this.category = category;
		this.brand = brand;
		this.invoiceDetails = invoiceDetails;
		this.galleries = galleries;
	}
	public Product() {
		super();
	}
	
	
}
