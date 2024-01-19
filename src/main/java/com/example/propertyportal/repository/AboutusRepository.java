package com.example.propertyportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.propertyportal.model.Aboutus;

public interface AboutusRepository extends JpaRepository<Aboutus, Integer> {
	Aboutus findFirstByOrderByHeadingAsc();
}
