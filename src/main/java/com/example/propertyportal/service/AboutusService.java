package com.example.propertyportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.propertyportal.model.Aboutus;
import com.example.propertyportal.repository.AboutusRepository;

@Service
public class AboutusService {

	@Autowired
	AboutusRepository aboutusRepository;
	
	public void addAboutus(Aboutus aboutus) {
		aboutusRepository.save(aboutus);
	}
	
	public List<Aboutus> getAllAboutus(){
		return aboutusRepository.findAll();
	}
	
	public Aboutus getAboutus() {
		return aboutusRepository.findFirstByOrderByHeadingAsc();
	}
	

}
