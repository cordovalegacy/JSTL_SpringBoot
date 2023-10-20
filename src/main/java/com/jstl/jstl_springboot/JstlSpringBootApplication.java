package com.jstl.jstl_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//@Controller annotation for our class (this will tell Spring Boot that we intend to use this to serve up views and not just raw data).

//EXAMPLE:
//@Controller
//public class FruitController {
//	@RequestMapping("/")
//	public String index() {
//		return "index.jsp";
//	}
//}

@SpringBootApplication

@Controller
public class JstlSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(JstlSpringBootApplication.class, args);
	}

	// class definition and imports here...
	@RequestMapping("/")
	public String index(Model model) {

		String name = "Grace Hopper";
		String itemName = "Copper wire";
		double price = 5.25;
		String description = "Metal strips, also an illustration of nanoseconds.";
		String vendor = "Little Things Corner Store";

		model.addAttribute("name", name);
		model.addAttribute("itemName", itemName);
		model.addAttribute("price", price);
		model.addAttribute("description", description);
		model.addAttribute("vendor", vendor);

		return "index.jsp";
	}

	//...



}
