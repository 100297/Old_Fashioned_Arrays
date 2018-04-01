package _01_array_manipulation;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		// TODO Auto-generated method stub
		for (int j2 = 0; j2 < testArray.length; j2++) {
			System.out.println(testArray[j2]);
		}
		boolean inserted = false;
		int[] newArray = new int[testArray.length + 1];
		for (int k = 0; k < i; k++) {
			newArray[k] = testArray[k];
		}
		
		newArray[i] =  j
				;
		for (int k = 0; k < testArray.length; k++) {
			newArray[k+1] = testArray[i];
		}
		for (int j2 = 0; j2 < newArray.length; j2++) {
			System.out.println(newArray[j2]);
		}
		
		
		
		
		
		//		for (int k = 0; k < testArray.length; k++) {
//			if (i == k) {
//			newArray[k] = j;
//			inserted = true;
//			} else {
//				if(inserted = false) {
//					newArray[k] = testArray[k];
//				} else {
//					if(k > 0) {
//						newArray[k] = testArray[k-1];
//					}
//					
//				}
//				
//			}
//			
//		}
		return newArray;

	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
