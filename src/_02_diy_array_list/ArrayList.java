package _02_diy_array_list;

public class ArrayList<T> {

	T[] ts;

	ArrayList() {
		ts = (T[]) new Object[0];

	}

	public void add(T i) {
		// TODO Auto-generated method stub

		T[] ts1 = (T[]) new Object[ts.length + 1];
		for (int j = 0; j < ts.length; j++) {
			ts1[j] = ts[j];
		}
		ts1[ts1.length - 1] = i;
		ts = ts1;
	}

	public void set(int i, String string) {
		// TODO Auto-generated method stub
			ts[i] = (T) string;
	}

	public Object get(int i) {
		// TODO Auto-generated method stub

		return ts[i];
	}

	public void addAt(T i, T c) {
		// TODO Auto-generated method stub

	}

	public boolean contains( String word) {
		for (int i = 0; i < ts.length; i++) {
			if(ts[i] == word) {
				return true;
			}
		}
		
		return false;
		// TODO Auto-generated method stub
			
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		T[] ts1 = (T[]) new Object[ts.length -1];
		for (int j = 0; j < i-1; j++) {
			ts1[j] = ts[j];
		}
		for (int j = i+1; j < ts.length; j++) {
			ts1[j] = ts[j];
		}
		ts = ts1;
	}

}
