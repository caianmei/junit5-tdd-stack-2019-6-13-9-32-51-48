package com.thoughtworks.tdd;

public class FizzBuzzNumberGame {

	public String fizzBuzz(int expected) {
		StringBuffer resultBuffer = new StringBuffer();
		if (expected % 3 == 0) {
			resultBuffer.append("Fizz");
		}
		if (expected % 5 == 0) {
			resultBuffer.append("Buzz");
		}
		if (expected % 7 == 0) {
			resultBuffer.append("Whizz");
		}
		if (resultBuffer.length() == 0) {
			resultBuffer.append(String.valueOf(expected));
		}
		
		return resultBuffer.toString();
	}

}
