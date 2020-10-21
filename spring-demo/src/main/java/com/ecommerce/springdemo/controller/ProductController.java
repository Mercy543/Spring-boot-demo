package com.ecommerce.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecomerce.webapp.exception.ProductNotFoundException;

@Controller
public class ProductController {

	@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	@ResponseBody
	public String getProducts(@PathVariable("id") String id) {
		
		if (id.contentEquals("0")) {
			throw new ProductNotFoundException();
			}
		return "Product is Available,very nice product";
	}
	
}
