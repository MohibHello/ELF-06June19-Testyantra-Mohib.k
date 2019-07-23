package com.tyss.warehouse.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "item")
public class ItemBean implements Serializable {

	@Id
	@Column(name = "item_id")
	private int itemId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "description")
	private String description;
	@Column(name = "cost")
	private double cost;
	@Column(name = "quantity")
	private int quantity;
}
