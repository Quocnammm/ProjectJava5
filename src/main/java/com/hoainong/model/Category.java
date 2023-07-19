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
@Table(name = "category")
public class Category {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoryID;
	@Column(name = "`name`")
	private String name;
	@OneToMany(mappedBy = "category")
	List<Product> products;
	public Integer getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
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
	public Category(Integer categoryID, String name, List<Product> products) {
		super();
		this.categoryID = categoryID;
		this.name = name;
		this.products = products;
	}
	public Category() {
		super();
	}
	
}
