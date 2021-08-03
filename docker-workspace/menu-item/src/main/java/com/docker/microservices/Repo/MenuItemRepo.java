package com.docker.microservices.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.microservices.model.MenuItem;

@Repository
public interface MenuItemRepo extends JpaRepository<MenuItem,Long>{
	
	public MenuItem findByItemName(String itemName);

}
