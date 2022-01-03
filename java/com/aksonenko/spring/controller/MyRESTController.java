package com.aksonenko.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.aksonenko.spring.service.ExampleService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/math")
public class MyRESTController {

	@Autowired
	private ExampleService exampleService;

//	@GetMapping("/examples")
//	public List<String> getExamples() {
//		List<String> examples = exampleService.getSomeExamples();
//
//		return examples;
//	}

	@GetMapping("/examples")
	public List<String> getExamples(@RequestParam("count") int count) {
		List<String> examples = exampleService.getExamples(count);
		System.out.println(count);

		return examples;
	}

}
