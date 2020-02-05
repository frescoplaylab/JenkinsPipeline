package javaApp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VowelsTest {
	@Test
	public void test() {
		String output = DisplayVowels.dispVowels("vowels");
		assertEquals("OE", output);
		System.out.println("Hi");
	}
}
