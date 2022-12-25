package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * DEVELOPED BY SUSOBHAN_LAL
 * 
 */

@Service
@Transactional
public class ShopService {
	@Autowired
	private ShopRepository repository;

	public List<Shop> listAll() {
		
		return repository.findAll() ;
	}

	public Shop get(Integer shopId) {
		
		return repository.findById(shopId).get();
	}

	public void save(Shop shop) {
		 repository.save(shop);
		
	}

	public void delete(Integer shopId) {
		repository.deleteById(shopId);
		
	}
	
	

}