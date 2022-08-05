import java.util.*;

public class ConvertLarestNumber {

	static void printLargestNum(Vector<String> vec) {

		Collections.sort(vec, new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				String XY = X + Y;
				String YX = Y + X;

				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});
		Iterator it = vec.iterator();
		System.out.print("Largest number: ");
		while (it.hasNext()) {
			System.out.print(it.next());
		}

	}

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("45");
		vec.add("15");
		vec.add("35");
		vec.add("25");

		printLargestNum(vec);
	}
}