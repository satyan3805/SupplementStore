package com.tmf.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.store.entites.Product;
import com.tmf.store.repository.ProductRepository;

@Service
public class DashboardService {

	@Autowired
	public ProductRepository productRepo;
	
	public List<Product> getAllProductsList(){
		return productRepo.findAll();
	}
	
}
