package com.tours.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tours.models.Flight;
import com.tours.models.Pack;
import com.tours.repos.PackRepository;

@Service
public class Packservice {
	@Autowired
	private PackRepository prepo;
	
	public List<Pack> listAll() {
		return prepo.findAll();
		
	}
	public Pack saveStudent(Pack pack) {
		return prepo.save(pack);
	}
	

}
