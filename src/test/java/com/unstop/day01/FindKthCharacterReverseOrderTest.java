package com.unstop.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FindKthCharacterReverseOrderTest {

	@Test
	public void testReverseString() {
		assertEquals("gfedcba", FindKthCharacterReverseOrder.reverseString("abcdefg"));
		assertEquals("zyxwvutsrqponmlkjihgfedcba",
				FindKthCharacterReverseOrder.reverseString("abcdefghijklmnopqrstuvwxyz"));
		assertEquals("a", FindKthCharacterReverseOrder.reverseString("a"));
		assertEquals("ba", FindKthCharacterReverseOrder.reverseString("ab"));
	}

	@Test
	public void testGetKthCharacter() {
		String reversedString = "gfedcba";
		assertEquals('g', FindKthCharacterReverseOrder.getKthCharacter(reversedString, 1));
		assertEquals('e', FindKthCharacterReverseOrder.getKthCharacter(reversedString, 3));
		assertEquals('a', FindKthCharacterReverseOrder.getKthCharacter(reversedString, 7));

		String reversedString2 = "zyxwvutsrqponmlkjihgfedcba";
		assertEquals('z', FindKthCharacterReverseOrder.getKthCharacter(reversedString2, 1));
		assertEquals('m', FindKthCharacterReverseOrder.getKthCharacter(reversedString2, 14));
		assertEquals('a', FindKthCharacterReverseOrder.getKthCharacter(reversedString2, 26));
	}

}
