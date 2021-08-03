package com.docker.micro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private MenuItem menuItem;
	private Coupon coupon;
	private double totalcost;
	

}
