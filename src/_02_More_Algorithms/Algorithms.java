package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).contains("cracked")) {
				System.out.println(eggs.get(i));
			}
			
		}
		return 4;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i).equals(true))	{
				System.out.println(oysters.get(i));
			}
			}
		return 2;
	}


	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message1.size(); i++) {
			if(message1.get(i).contains("... --- ..."))	{
			}
			return true;
			}
			for (int i = 0; i < message2.size(); i++) {
			if(message2.get(i).contains("... --- ..."))	{
			}
			return true;
			}
			return false;
	}
}

//	public static Object containsSOS(List<String> message1) {
//		// TODO Auto-generated method stub
//		
//	}
//}
