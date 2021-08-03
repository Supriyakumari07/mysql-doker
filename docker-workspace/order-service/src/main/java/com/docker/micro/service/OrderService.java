package com.docker.micro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.docker.micro.model.Coupon;
import com.docker.micro.model.MenuItem;
import com.docker.micro.model.Order;

@Service
public class OrderService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Order getOrderDetails(String itemName,String couponCode) {
		MenuItem item=restTemplate.getForObject("http://menu-item/items/item-name/"+itemName,MenuItem.class);
		Coupon coupon=restTemplate.getForObject("http://coupon-item/coupons/coupon-code/"+couponCode,Coupon.class);
		double totalcost=item.getPrice()-(item.getPrice()*(coupon.getDiscount()/100));
		return new Order(item,coupon,totalcost);
		
		
	}

}
