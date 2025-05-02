package com.sunshine.sunspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sunshine.sunspring.model.Buyer;
import com.sunshine.sunspring.repository.BuyerRepository;

@RestController
@RequestMapping("/buyer")
@CrossOrigin(origins = "http://localhost:4200")
public class BuyerController {
	
	@Autowired
	
	private BuyerRepository br;
	
	@GetMapping
	
	// this is the method to find all the buyer object from the table
	
	public List<Buyer> getAllBuyer(){
		
		return br.findAll();
	}
	
	
	//  this is the method to update the buyer by the id ,and put the update value
	
	@PutMapping("/{id}")
	
	public Buyer updateBuyer(@PathVariable Long id,@RequestBody Buyer buyer) {
		
		// this is to so that the new buyer not saved in the database 
		
		buyer.setBuyerId(id);
		  
		  
		return br.save(buyer);
		
	}
	
	
	
	// this is to post means insert to the database
	
	
	@PostMapping
	
	public Buyer postBuyer(@RequestBody Buyer buyer) {
		
		
		return br.save(buyer);
	}
	
	
	
	// this is the delete method 
	
	@DeleteMapping("/{id}")
	
	public void  deleteBuyer(@PathVariable Long id) {
		
		 br.deleteById(id);
	}

}
