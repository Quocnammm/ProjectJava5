package com.hoainong.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "brand")
public class Brand {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer brandID;
	@Column(name = "`name`")
	private String name;
	@OneToMany(mappedBy = "brand")
	List<Product> products;
	public Brand(Integer brandID, String name, List<Product> products) {
		super();
		this.brandID = brandID;
		this.name = name;
		this.products = products;
	}
	public Brand() {
		super();
	}
	public Integer getBrandID() {
		return brandID;
	}
	public void setBrandID(Integer brandID) {
		this.brandID = brandID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}

