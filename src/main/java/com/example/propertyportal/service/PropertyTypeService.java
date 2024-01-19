package com.example.propertyportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.propertyportal.model.Aboutus;
import com.example.propertyportal.model.PropertyType;
import com.example.propertyportal.repository.PropertyTypeRepository;

@Service
public class PropertyTypeService {

	@Autowired
	PropertyTypeRepository propertyTypeRepository;
	
	public void addPropertyType(PropertyType propertytype) {
		propertyTypeRepository.save(propertytype);
	}
}
