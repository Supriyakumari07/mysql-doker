package com.docker.micro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.micro.model.Coupon;

@Repository
public interface CouponRepo extends JpaRepository<Coupon,Long> {
	public Coupon findByCouponCode(String couponCode);
}
