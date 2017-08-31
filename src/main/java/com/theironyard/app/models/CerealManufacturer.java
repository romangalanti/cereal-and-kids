package com.theironyard.app.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CerealManufacturer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@Column(nullable=false)
	private String name;
	
	@OneToMany(mappedBy="manufacturer")
	private List<Cereal> cereals;
	
	public CerealManufacturer() {}
	
	public CerealManufacturer(String name) {
		this.name = name;
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

	public List<Cereal> getCereals() {
		return cereals;
	}

	public void setCereals(List<Cereal> cereals) {
		this.cereals = cereals;
	}
}



















