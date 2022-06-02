package com.codingdojo.savetravels.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="expenses")
public class Expense {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;
@NotNull
@Size(min = 2, max = 100, message="must be at least 2 Characters long")
private String name;
@NotNull
@Size(min = 2, max = 100, message="must be at least 2 Characters long")
private String vendor;
@NotNull
@Size(min=5, max=300, message="Must be at least 5 characters long")
private String description;
@NotNull
@Min(1)
private Double price;

public Expense() {
}
public Expense(String name, String vendor, String description, Double price){
	this.name = name;
	this.vendor = vendor;
	this.price = price;
	this.description = description;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getVendor() {
	return vendor;
}
public void setVendor(String vendor) {
	this.vendor = vendor;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
}
