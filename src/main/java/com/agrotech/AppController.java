package com.agrotech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@Controller
@EnableAutoConfiguration
@ComponentScan
public class AppController {
	
	@RequestMapping("/namasthe")
	public String namasthe() {
		return "namasthe";
	}

}
