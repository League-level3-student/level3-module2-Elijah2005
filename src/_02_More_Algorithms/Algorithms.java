package _02_More_Algorithms;

import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).contains("cracked")) {
				System.out.println(eggs.get(i));
				return i;
			}
		}
		return eggs.size();
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				System.out.println(oysters.get(i));
				return i;
			}
		}
		return oysters.size();
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double greatest = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > greatest) {
				greatest = peeps.get(i);
			}
		}
		return greatest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String greatest = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			String otherWords = words.get(i);
			if(otherWords.length() > greatest.length()) {
				greatest = otherWords;
			}
		}
		return greatest;
	}

	public static double sortScores(List<Double> results) {
		// TODO Auto-generated method stub
			double n = results.size();
			for (double i = n / 2; i > 0; i--) {
				heapSort(results, n, i, display);
			}
			for (double i = n - 1; i > 0; i--) {
		return results.size();
		double temporary = results.get(0);
		results.get(0) = results.get(i);
		results.get(i) = temporary;
		heapSort(results, i, 0, display);
		double largest = i;
		double l = 2 * i + 1;
		double r = 2 * i + 2;
		if (l < n && results.get(l) > results.get(largest)) {
			largest = l;
		}
		if (r < n && results.get(r) > results.get(largest)) {
			largest = r;
		}
		if (largest != i) {
			double temporary = results.get(i);
			results.get(i) = results.get(largest);
			array[largest] = temporary;
			heapSort(results, n, largest, display);
		}
		display.updateDisplay();
	}

}

}
