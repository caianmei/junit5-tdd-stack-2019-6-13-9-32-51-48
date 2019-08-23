package com.thoughtworks.tdd;

public class FizzBuzzNumberGame {

	public String fizzBuzz(int expected) {
		if (expected % 3 == 0 && expected % 5 == 0 && expected % 7 == 0) {
			return "FizzBuzzWhizz";
		}
		if ((expected % 3 == 0 && expected % 5 == 0) || (expected % 3 == 0 && expected % 7 == 0)
				|| (expected % 5 == 0 && expected % 7 == 0)) {
			return "FizzBuzz";
		}
		if (expected % 3 == 0) {
			return "Fizz";
		}
		if (expected % 5 == 0) {
			return "Buzz";
		}
		if (expected % 7 == 0) {
			return "Whizz";
		}
		return String.valueOf(expected);
	}

}
