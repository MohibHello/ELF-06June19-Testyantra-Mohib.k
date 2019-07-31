package com.tyss.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class ProductBean {

	@Id
	@Column(name = "productId")
	private int productId;
	@Column(name = "productName")
	private String productName;
	@Column(name = "price")
	private double price;
	@Column(name = "weight")
	private double weight;
}
