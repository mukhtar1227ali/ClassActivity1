import java.util.LinkedList;
import java.util.Scanner;

public class SortMyData {

	LinkedList<String> myList;
	int minSize;
	int status;
	int dataType;

	public SortMyData(int status, int dataType) {
		myList = new LinkedList<String>();
		this.status = status;
		this.dataType = dataType;

		// readData(myList);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dataType = scan.nextInt();
		int status = scan.nextInt();
		LinkedList<String> myList = new LinkedList<String>();		
		SortContext context = new SortContext();
		if (dataType == 1) {
			if (status == 1) {
				context.setSortStratergy(new SortX());
			} else if (status == 2) {
				context.setSortStratergy(new SortY());
			} else if (status == 3) {
				context.setSortStratergy(new SortZ());
			}
		} else {
			context.setSortStratergy(new SortX());
		}
		
		context.sort();
	}

}
