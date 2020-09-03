//This scored a 100

//package ArraySet;

import static java.util.Arrays.sort;
import java.util.ArrayList;
import java.util.List;

public class SetWithArray {
	
	public static void main(String[] args) {
		
		SetWithArray x = new SetWithArray(new int[] {1, 2, 3});
		SetWithArray y = new SetWithArray(new int[] {6, 7});
		System.out.println(new SetWithArray(x.union(y)));
		
	}
	
	private final int[] x;
	
	public SetWithArray(int[] px) {
		
		x = new int[px.length];
		
		for (int i = px.length - 1; 0 <= i; i--) {
			
			x[i] = px[i];
			
		}
		
		sort(x);
		
	}
	
	public int[] union(SetWithArray y) {
		
		int[] intersection = this.intersection(y);
		ArrayList<Integer> total = new ArrayList<Integer>();
		
		for (int n: this.x) {
			
			total.add(n);
			
		}
		
		for (int n: y.x) {
			
			if (binarySearch(intersection, n) == -1) {
				
				total.add(n);
				
			}
			
		}
		
		int[] out = new int[total.size()];
		
		for (int i = 0; i < out.length; i++) {
			
			out[i] = total.get(i);
			
		}
		
		sort(out);
		return out;
		
	}
	
	public int[] union(int[] y) {
		
		return this.union(new SetWithArray(y));
		
	}
	
	public int[] intersection(SetWithArray y) {
		
		ArrayList<Integer> total = new ArrayList<Integer>();
		
		for (int n: this.x) {
			
			if (binarySearch(y.x, n) != -1) {
				
				total.add(n);
				
			}
			
		}
		
		int[] out = new int[total.size()];
		
		for (int i = 0; i < out.length; i++) {
			
			out[i] = total.get(i);
			
		}
		
		sort(out);
		return out;
		
	}
	
	public int[] intersection(int[] y) {
		
		return this.intersection(new SetWithArray(y));
		
	}
	
	public int[] difference(SetWithArray y) {
		
		int[] intersection = this.intersection(y);
		ArrayList<Integer> total = new ArrayList<Integer>();
		
		for (int n: this.x) {
			
			if (binarySearch(intersection, n) == -1) {
				
				total.add(n);
				
			}
			
		}
		
		int[] out = new int[this.x.length - intersection.length];
		
		for (int i = 0; i < out.length; i++) {
			
			out[i] = total.get(i);
			
		}
		
		sort(out);
		return out;
		
	}
	
	public int[] difference(int[] y) {
		
		return this.difference(new SetWithArray(y));
		
	}
	
	public boolean isSubSetOf(SetWithArray y) {
		
		return this.intersection(y).length == this.x.length;
		
	}
	
	public boolean isSubSetOf(int[] y) {
		
		return this.isSubSetOf(new SetWithArray(y));
		
	}
	
	public boolean isEqualTo(SetWithArray y) {
		
		return this.equals(y);
		
	}
	
	public boolean isEqualTo(int[] y) {
		
		return this.equals(new SetWithArray(y));
		
	}
	
	public int[] symmetricDifference(SetWithArray y) {
		
		int[] xmy = this.difference(y);
		int[] ymx = y.difference(this);
		int[] union = new SetWithArray(xmy).union(ymx);
		return union;
		
	}
	
	public int[] symmetricDifference(int[] y) {
		
		return symmetricDifference(new SetWithArray(y));
		
	}
	
	public boolean isPartition(List<int[]> s) {
		
		SetWithArray sum = new SetWithArray(new int[0]);
		int totalLength = 0;
		
		for (int[] set: s) {
			
			sum = new SetWithArray(sum.union(set));
			totalLength += set.length;
			
		}
		
		return totalLength == x.length && this.equals(sum);
		
	}
	
	public boolean equals(SetWithArray y) {
		
		if (this.x.length != y.x.length) {
			
			return false;
			
		}
		
		for (int i = 0; i < this.x.length; i++) {
			
			if (this.x[i] != y.x[i]) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public boolean equals(int[] y) {
		
		return this.equals(new SetWithArray(y));
		
	}
	
	private static int binarySearch(int[] array, int n) {
		
		int l = 0;
		int h = array.length - 1;
		int m = (l + h) / 2;
		
		while (l <= h) {
			
			int comparison = n - array[m];
			
			if (comparison < 0) {
				
				h = m - 1;
				
			} else if (0 == comparison) {
				
				return m;
				
			} else {
				
				l = m + 1;
				
			}
			
			m = (l + h) / 2;
			
		}
		
		return -1;
		
	}
	
	public int[] x() {
		
		return this.x;
		
	}
	
	public String toString() {
		
		String sum = "";
		
		for (int n: x) {
			
			sum += ", " + String.valueOf(n);
			
		}
		
		return sum.substring(2);
		
	}
	
}