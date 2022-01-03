package com.aksonenko.spring.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.aksonenko.example.MathExample;

@Service
public class ExampleServiceImpl implements ExampleService {

//	@Override
//	public List<String> getSomeExamples() {
//		return MathExample.getSomeExamples();
//	}

	@Override
	public List<String> getExamples(int count) {
		return MathExample.getExamples(count);
	}

}
