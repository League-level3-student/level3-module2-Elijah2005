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

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double greatest = peeps.get(0);
		for (int i = 0; i > peeps.size(); i++) {
			if(peeps.get(i) > greatest) {
				greatest = peeps.get(i);
			}
	}
		return greatest;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message1.size(); i++) {
		if(message1.contains("... --- ...")) {
			return true;
		}
		}
		return false;
	}
}

	


