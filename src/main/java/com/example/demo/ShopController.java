package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * DEVELOPED BY SUSOBHAN_LAL
 *
 */


@RestController
public class ShopController {
	
	@Autowired
	private ShopService service;
	
	//Retrieve all the rows  from the database
	@GetMapping("/shops")
	public List<Shop> list(){
		
		return service.listAll();
		
	}
	
	//Retrieve Specific records from database
	
	@GetMapping("/shops/{shop_Id}")
	public ResponseEntity<Shop> get(@PathVariable Integer shop_Id){
		Shop shop=service.get(shop_Id);
		return new ResponseEntity<Shop>(shop, HttpStatus.OK);
	}
	
	//create a row in the database
	@PostMapping("/shops")
	public void add(@RequestBody Shop shop) {
		service.save(shop);
		
	}
	
	//Update a record in database
	
	@PutMapping("/shops/{shop_Id}")
	public ResponseEntity<?> update(@RequestBody Shop shop, @PathVariable Integer shop_Id){
		try {
			Shop existShop=service.get(shop_Id);
			service.save(shop);
			return new ResponseEntity<Shop>(shop, HttpStatus.OK);
		}
		catch (Exception e) {
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/shops/{shop_Id}")
	public void delete( @PathVariable Integer shop_Id) {
		service.delete(shop_Id);
		
	}
	
	

}
