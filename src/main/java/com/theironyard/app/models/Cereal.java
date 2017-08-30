package com.theironyard.app.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Cereal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=255, nullable=false)
	private String name;
	
	private int yearIntroduced;
	
	@ManyToOne
	private CerealManufacturer manufacturer;
	
	@ManyToMany(mappedBy="cereals")
	private List<Kid> kids;
	
	public Cereal() {}
	
	public Cereal(String name, int yearIntroduced) {
		this.name = name;
		this.yearIntroduced = yearIntroduced;
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
	
	public int getYearIntroduced() {
		return yearIntroduced;
	}
	
	public void setYearIntroduced(int yearIntroduced) {
		this.yearIntroduced = yearIntroduced;
	}

	public CerealManufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(CerealManufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
}









