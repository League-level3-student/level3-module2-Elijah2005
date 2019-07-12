package _00_Sorting_Algorithms;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * INSTRUCTIONS
 * Run the demo VisualSorter.jar to see the finished product. 
 * Then complete the steps in the classes in the following order:
 * 
 * BubbleSorter
 * SelectionSorter
 * InsertionSorter
 * QuickSorter
 * MergeSorter
 * HeapSorter
 * BogoSorter
 */

public class _02_SortingAlgorithms {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		JPanel panel = new JPanel();
		JButton BubbleSorter = new JButton();
		JButton SelectionSorter = new JButton();
		JButton InsertionSorter = new JButton();
		JButton QuickSorter = new JButton();
		JButton MergeSorter = new JButton();
		JButton HeapSorter = new JButton();
		JButton BogoSorter = new JButton();
		window.add(panel);
		panel.add(BubbleSorter);
		panel.add(SelectionSorter);
		panel.add(InsertionSorter);
		panel.add(QuickSorter);
		panel.add(MergeSorter);
		panel.add(HeapSorter);
		panel.add(BogoSorter);
		window.setVisible(true);
		BubbleSorter.setText("Bubble");
		SelectionSorter.setText("Selection");
		InsertionSorter.setText("Insertion");
		QuickSorter.setText("Quick");
		MergeSorter.setText("Merge");
		HeapSorter.setText("Heap");
		BogoSorter.setText("Bogo");
		window.pack();
		
	}
}
		
//		String[] options = new String[] {"Bogo", "Heap", "Merge", "Quick","Insertion","Selection", "Bubble"};
//		int input = JOptionPane.showOptionDialog(null, "Choose a sorting algorithm to visualize", "Sorting Algorithms", 0, 
//				-1, null, options, 0);
//		
//		String choice = options[input];
//		
//		switch(choice) {
//		case "Bubble":{
//			new SortingVisualizer(new BubbleSorter());
//			break;
//		}
//		case "Selection":{
//			new SortingVisualizer(new SelectionSorter());
//			break;
//		}
//		case "Insertion":{
//			new SortingVisualizer(new InsertionSorter());
//			break;
//		}
//		case "Quick":{
//			new SortingVisualizer(new QuickSorter());
//			break;
//		}
//		case "Merge":{
//			new SortingVisualizer(new MergeSorter());
//			break;
//		}
//		case "Heap":{
//			new SortingVisualizer(new HeapSorter());
//			break;
//		}
//		case "Bogo":{
//			new SortingVisualizer(new BogoSorter());
//			break;
//		}
//		}
//	}
//}
