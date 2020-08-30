import java.util.LinkedList;

public class SortContext {

	private SortStratergy sortingStratergy;

	public void setSortStratergy(SortStratergy sortingStratergy) {
		this.sortingStratergy = sortingStratergy;
	}

	private LinkedList<String> readData() {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("10");
		myList.add("20");
		myList.add("30");
		myList.add("40");
		myList.add("50");
		return myList;

	}

	public void sort() {
		LinkedList<String> myList = readData();
		myList = sortingStratergy.sort(myList);
		System.out.println(myList);
	}

}
