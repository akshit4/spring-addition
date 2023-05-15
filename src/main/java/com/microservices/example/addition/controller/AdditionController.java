package com.microservices.example.addition.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addition")
public class AdditionController {

	@GetMapping
	public String addition(@RequestBody String number1, @RequestBody String number2) {
		System.out.println(number1+" "+number2);
		int augend1 = Integer.valueOf(number1);
		int augend2 = Integer.valueOf(number2);
		return "Addition of 2 number is "+(augend1+augend2);
	}
}
