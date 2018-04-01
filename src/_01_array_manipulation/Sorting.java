package _01_array_manipulation;

public class Sorting {

	public static void sort(String[] testArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < testArray.length; i++) {
			for (int j = 0; j < testArray.length; j++) {
				if (testArray[i].compareTo(testArray[j]) < 0) {
					String a = testArray[i];
					testArray[i] = testArray[j];
					testArray[j] = a;

				}
			}
		}
	}

}
