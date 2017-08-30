package com.theironyard.app.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theironyard.app.models.Cereal;

@Repository
public interface CerealRepository extends JpaRepository<Cereal, Long> {

	List<Cereal> findByYearIntroducedEquals(int year);
	
	List<Cereal> findByNameContaining(String cheese);
	
	List<Cereal> findByYearIntroducedEqualsAndNameContaining(int year, String cheese);
	
}
