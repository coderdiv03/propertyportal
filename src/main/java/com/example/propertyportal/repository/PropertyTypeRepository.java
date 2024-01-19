package com.example.propertyportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.propertyportal.model.PropertyType;

public interface PropertyTypeRepository extends JpaRepository<PropertyType, Integer> {

}
