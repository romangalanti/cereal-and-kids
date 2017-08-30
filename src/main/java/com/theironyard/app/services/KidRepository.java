package com.theironyard.app.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theironyard.app.models.Kid;

@Repository
public interface KidRepository extends JpaRepository<Kid, Long> {

}
