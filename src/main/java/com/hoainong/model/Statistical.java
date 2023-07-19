package com.hoainong.model;

import java.util.Date;

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
@Table(name = "statistical")
public class Statistical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne @JoinColumn(name = "userID")
	User user;

    @Column(name = "dateCreat")
    private Date dateCreat;

    @Column(name = "total")
    private Double total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDateCreat() {
		return dateCreat;
	}

	public void setDateCreat(Date dateCreat) {
		this.dateCreat = dateCreat;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Statistical(int id, User user, Date dateCreat, Double total) {
		super();
		this.id = id;
		this.user = user;
		this.dateCreat = dateCreat;
		this.total = total;
	}

	public Statistical() {
		super();
	}

    // constructors, getters and setters
    
}


