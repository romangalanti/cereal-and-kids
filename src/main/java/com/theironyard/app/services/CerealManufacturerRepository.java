package com.theironyard.app.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theironyard.app.models.CerealManufacturer;

@Repository
public interface CerealManufacturerRepository extends JpaRepository<CerealManufacturer, Long>  {

}
