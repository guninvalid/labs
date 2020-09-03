//This scored a 100

//package allenwittryset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AllenWittrySet<E> implements Comparable<E> {
	
	private Set<E> set;
	
	public AllenWittrySet(String type) {
		
		if ("hash".equals(type)) {
			
			set = new HashSet<E> ();
			
		} else if ("tree".equals(type)) {
			
			set = new TreeSet<E> ();
			
		} else {
			
			set = new HashSet<E> ();
			
		}
		
	}
	
	public AllenWittrySet(E[] array) {
		
		this("tree");
		
		for (E i: array) {
			
			add(i);
			
		}
		
	}
	
	public AllenWittrySet<E> setUnion(AllenWittrySet<E> s) {
		
		AllenWittrySet<E> output = new AllenWittrySet<E>("tree");
		Iterator<E> loop = this.iterator();
		
		while (loop.hasNext()) {
			
			output.add(loop.next());
			
		}
		
		loop = s.iterator();
		
		while (loop.hasNext()) {
			
			output.add(loop.next());
			
		}
		
		return output;
		
	}
	
	public AllenWittrySet<E> setIntersection(AllenWittrySet<E> s) {
		
		AllenWittrySet<E> output = new AllenWittrySet<E>("tree");
		Iterator<E> loop = s.iterator();
		
		while (loop.hasNext()) {
			
			E elem = loop.next();
			
			if (this.contains(elem)) {
				
				output.add(elem);
				
			}
			
		}
		
		return output;
		
	}
	
	public AllenWittrySet<E> setDifference(AllenWittrySet<E> s) {
		
		AllenWittrySet<E> output = new AllenWittrySet<E>("tree");
		Iterator<E> loop = this.iterator();
		
		while (loop.hasNext()) {
			
			E elem = loop.next();
			
			if (!s.contains(elem)) {
				
				output.add(elem);
				
			}
			
		}
		
		return output;
		
	}
	
	public boolean isSubsetOf(AllenWittrySet<E> s) {
		
		Iterator<E> loop = this.iterator();
		
		while (loop.hasNext()) {
			
			if (!s.contains(loop.next())) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public boolean isProperSubsetOf(AllenWittrySet<E> s) {
		
		return this.size() < s.size() && this.isSubsetOf(s);
		
	}
	
	public Iterator<E> iterator() {
		
		return set.iterator();
		
	}
	
	public int size() {
		
		return set.size();
		
	}
	
	public boolean isEmpty() {
		
		return this.size() == 0;
		
	}
	
	public boolean contains(E elem) {
		
		return set.contains(elem);
		
	}
	
	public void clear() {
		
		set.clear();
		
	}
	
	public Object[] toArray() {
		
		Object[] output = new Object[this.size()];
		Iterator<E> loop = this.iterator();
		final int S = this.size();
		
		for (int i = 0; i < S && loop.hasNext(); i++) {
			
			output[i] = loop.next();
			
		}
		
		return output;
		
	}
	
	public void add(E elem) {
		
		set.add(elem);
		
	}
	
	public void remove(E elem) {
		
		set.remove(elem);
		
	}
	
	public int compareTo(E sobject) {
		
		AllenWittrySet<E> s = (AllenWittrySet<E>) sobject;
		
		if (this.size() == s.size() && this.equals(s)) {
			
			return 0;
			
		}
		
		return -1;
		
	}
	
	public boolean equals(Object sobject) {
		
		if (!(sobject instanceof AllenWittrySet<?>)) {
			
			return false;
			
		}
		
		AllenWittrySet<E> s = (AllenWittrySet<E>) sobject;
		return this.size() == s.size() && this.setIntersection(s).size() == this.size();
		
	}
	
	public boolean equals(Integer[] array) {
		
		return this.equals(new AllenWittrySet<Integer>(array));
		
	}
	
	public String toString() {
		
		if (this.isEmpty()) {
			
			return "[]";
			
		}
		
		String output = "";
		Iterator<E> loop = this.iterator();
		
		while(loop.hasNext()) {
			
			output += ", " + loop.next().toString();
			
		}
		
		return "[" + output.substring(2) + "]";
		
	}
	
}