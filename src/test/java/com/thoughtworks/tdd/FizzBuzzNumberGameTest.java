package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzNumberGameTest {

	@Test
	public void should_return_1_when_fizzBuzz_Then_1() {
		//Given
		
		int expected = 1;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		//When
		String word = fizzBuzzNumberGame.fizzBuzz(expected);
		//Then
		Assertions.assertEquals("1",word);
	}
	
	@Test
	public void should_return_Fizz_when_fizzBuzz_Then_3() {
		//Given
		
		int expected = 3;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		//When
		String word = fizzBuzzNumberGame.fizzBuzz(expected);
		//Then
		Assertions.assertEquals("Fizz",word);
	}
	
	@Test
	public void should_return_Buzz_when_fizzBuzz_Then_5() {
		//Given
		
		int expected = 5;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		//When
		String word = fizzBuzzNumberGame.fizzBuzz(expected);
		//Then
		Assertions.assertEquals("Buzz",word);
	}
	
	@Test
	public void should_return_Whizz_when_fizzBuzz_Then_7() {
		//Given
		
		int expected = 7;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		//When
		String word = fizzBuzzNumberGame.fizzBuzz(expected);
		//Then
		Assertions.assertEquals("Whizz",word);
	}
	
	@Test
	public void should_return_FizzBuzz_when_fizzBuzz_Then_15() {
		//Given
		
		int expected = 15;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		//When
		String word = fizzBuzzNumberGame.fizzBuzz(expected);
		//Then
		Assertions.assertEquals("FizzBuzz",word);
	}
	
	@Test
	public void should_return_FizzBuzz_when_fizzBuzz_Then_21() {
		//Given
		
		int expected = 21;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		//When
		String word = fizzBuzzNumberGame.fizzBuzz(expected);
		//Then
		Assertions.assertEquals("FizzBuzz",word);
	}
	
	@Test
	public void should_return_FizzBuzz_when_fizzBuzz_Then_35() {
		//Given
		
		int expected = 35;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		//When
		String word = fizzBuzzNumberGame.fizzBuzz(expected);
		//Then
		Assertions.assertEquals("FizzBuzz",word);
	}
	
	@Test
	public void should_return_FizzBuzz_when_fizzBuzz_Then_105() {
		//Given
		
		int expected = 105;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		//When
		String word = fizzBuzzNumberGame.fizzBuzz(expected);
		//Then
		Assertions.assertEquals("FizzBuzzWhizz",word);
	}
}
