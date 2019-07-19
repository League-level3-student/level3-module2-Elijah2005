package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	void sort(int[] array, SortingVisualizer display) {
		new SortingVisualizer(new BubbleSorter());
		display.updateDisplay();
	}
	
}
