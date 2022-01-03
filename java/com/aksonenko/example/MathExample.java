package com.aksonenko.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MathExample {
	public static List<String> getExamples(int count) {
		List<String> examples = new LinkedList<>();
		for (int i = 0; i < count; i++) {
			examples.add(getExample());
		}

		return examples;
	}

//	public static List<String> getSomeExamples() {
//		List<String> examples = new LinkedList<>();
//		examples.add("2+2");
//		examples.add("3-1");
//		examples.add("6*5");
//		examples.add("10/2");
//		examples.add("5*10");
//
//		return examples;
//	}

	public static String getExample() {

		Random random = new Random();

		List<String> list = new LinkedList<>();
		list.add("+");
		list.add("-");
		list.add("*");
		list.add("/");

		String result;

		result = random.nextInt(99) + list.get(random.nextInt(4)) + random.nextInt(99);

		return result;

	}
}
