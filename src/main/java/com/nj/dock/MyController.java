package com.nj.dock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping("/api")
	public class MyController {
		@GetMapping("/m3example")

		public  String dummy(){

		return "Demo for M3 by Niju";

		}
	}

