package _02_More_Algorithms;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class _01_SearchingAndSortingAlgorithms {

	/**
	 * Create the methods in the Algorithm class so that it will make the following
	 * tests pass. When you get a green bar, uncomment the next test until you have
	 * solved them all. Expand your vocabulary while you're at it.
	 **/

	/*
	 * 1. Create a method that will find and return the first index of a broken egg
	 */
	@Test
	public void testSearch() {
		List<String> eggs = Arrays.asList(new String[] { "whole", "whole", "whole", "whole", "cracked", "whole",
				"whole", "whole", "cracked", "whole", "whole", "whole" });
		assertEquals(4, Algorithms.findBrokenEgg(eggs));
		for (int i = 0; i < eggs.size(); i++) {
		if(eggs.get(i).contains("cracked")) {
			System.out.println(eggs.get(i));
		}
		}
	}

	/* 2. Count how many oysters contain pearls. */
	@Test
	public void testSearchAndAccumulate() throws Exception {
		List<Boolean> oysters = Arrays.asList(new Boolean[] { false, false, true, false, false, false, false, false, false, false, false,
				false, false, false, false, false, false, false, false, false, false, false, false, true });
		assertEquals(2, Algorithms.countPearls(oysters));
	}

	/* 3. Create a method that will return the height of the tallest person. */
	@Test
	public void testFindMaxiumum() throws Exception {
		List<Double> peeps = Arrays.asList(new Double[] { 5.7, 6.2, 3.4, 6.2, 5.0, 5.5, 4.7, 6.2, 3.4, 4.2, 5.0, 4.5, 5.1, 6.6 });
		assertEquals(6.6, Algorithms.findTallest(peeps), 0.0);
	}

	/* 4. Create a method that will find the longest word. */
	@Test
	public void testFindMaxiumumString() throws Exception {
		List<String> words = Arrays.asList(new String[] { "accoutrements", "acumen", "anomalistic", "auspicious", "bellwether",
				"callipygian", "circumlocution", "concupiscent", "conviviality", "coruscant", "cuddlesome", "cupidity", "cynosure",
				"ebullient", "equanimity", "excogitate", "gasconading", "idiosyncratic", "luminescent", "magnanimous", "nidificate",
				"osculator", "parsimonious", "penultimate", "perfidiousness", "perspicacious", "proficuous", "remunerative", "saxicolous",
				"sesquipedalian", "superabundant", "unencumbered", "unparagoned", "usufruct", });
		assertEquals("circumlocution", Algorithms.findLongestWord(words));
	}

	/*
	 * 5. The Morse code for SOS is "... --- ..." Create a method that can tell if
	 * SOS is contained in a message.
	 */
	@Test
	public void testFindString() throws Exception {
		List<String> message1 = Arrays.asList(".... . .-. .-. --- / ... --- ... / -.-- .- .-.. .-.. ...".split("/"));
		assertEquals(true, Algorithms.containsSOS(message1));
		List<String> message2 = Arrays.asList(".-- .. - .... / - .... . / .-.. .. --. .... - ... / --- ..- - --..-- / .. - .----. ... / .-.. . ... ... / -.. .- -. --. . .-. --- ..- ... / .... . .-. . / .-- . / .- .-. . / -. --- .-- ? / . -. - . .-. - .- .. -. / ..- ... / .. / ..-. . . .-.. / ... - ..- .--. .. -.. / .- -. -.. / -.-. --- -. - .- --. .. --- ..- ... / .... . .-. . / .-- . / .- .-. . / -. --- .-- ? / . -. - . .-. - .- .. -. / ..- ... / .- / -- ..- .-.. .- - - --- --..-- / .- -. / .- .-.. -... .. -. --- --..-- / .- / -- --- ... --.- ..- .. - --- --..-- / -- -.-- / .-.. .. -... .. -.. --- / -.-- . .- .... --..-- / .... . -.-- / -.-- . .- ....".split("/"));
		assertEquals(false, Algorithms.containsSOS(message2));
	}
}

	/* 6. Write a morse code translator to read the messages. Just kidding! */