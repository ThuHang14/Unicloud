package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		HandleManagemenent handleManagemenent = context.getBean(HandleManagemenent.class);
		CheckRequest checkRequest = new CheckRequest();
		Handler handler = handleManagemenent.getHandle(checkRequest);

		System.out.println(handler.toString());

		OrderRequest orderRequest = new OrderRequest();
		Handler handlerOrder = handleManagemenent.getHandle(orderRequest);


		System.out.println(handlerOrder.toString());
	}

}
