package com.aryatelang.Store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

	//	SpringApplication.run(StoreApplication.class, args);
		//var orderService = new OrderService(new Stripe());
		//orderService.placeOrder();

		// setter is good fro optional dependencies , since the code crashes without a setter
		var orderService = new OrderService();
		orderService.setPaymentService(new PayPal());
		orderService.placeOrder();
	}

}
