//This scored a 100

//package dora;

import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DorasGreatMapAdventure<K, E>{
	
	private Map<K, Set<E>> map;
	
	public DorasGreatMapAdventure(String type) {
		
		if ("hash".equals(type)) {
			
			map = new HashMap<K, Set<E>>();
			
		} else if ("tree".equals(type)) {
			
			map = new TreeMap<K, Set<E>>();
			
		} else {
			
			map = new HashMap<K, Set<E>>();
			
		}
		
	}
	
	public Set<K> keySet() {
		
		return map.keySet();
		
	}
	
	public Map<K, Set<E>> getMap() {
		
		return map;
		
	}
	
	public void add(K key, E elem) {
		
		if (containsKey(key)) {
			
			map.get(key).add(elem);
			
		} else {
			
			Set<E> tmp = new TreeSet<E>();
			tmp.add(elem);
			map.put(key, tmp);
			
		}
		
	}
	
	public int size() {
		
		return allElements().size() + map.size();
		
	}
	
	public int numItems() {
		
		int size = 0;
		
		for (Entry<K, Set<E>> set: map.entrySet()) {
			
			size += set.getValue().size();
			
		}
		
		return size;
		
	}
	
	public int numDistinctItems() {
		
		return allUniqueElements().size();
		
	}
	
	public boolean isEmpty() {
		
		return numDistinctItems() == 0;
		
	}
	
	public boolean contains(Object elem) {
		
		for (Entry<K, Set<E>> set: map.entrySet()) {
			
			for (E elements: set.getValue()) {
				
				if (elem.equals(elements)) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
		
	}
	
	public boolean containsKey(K key) {
		
		return map.containsKey(key);
		
	}
	
	public Object[] toArray() {
		
		return allElements().toArray();
		
	}
	
	public void remove(K key, E elem) {
		
		Set<E> set = map.get(key);
		set.remove(elem);
		
		if (set.isEmpty()) {
			
			map.remove(key);
			
		}
		
	}
	
	public void removeFromAll(E elem) {
		
		ArrayList<K> rm = new ArrayList<K>();
		
		for (K key: keySet()) {
			
			Set<E> set = map.get(key);
			set.remove(elem);
			
			if (set.isEmpty()) {
				
				rm.add(key);
				
			}
			
		}
		
		for (K key: rm) {
			
			map.remove(key);
			
		}
		
	}
	
	public boolean equals(Object yobject) {
		
		if (!(yobject instanceof DorasGreatMapAdventure<?, ?>)) {
			
			return false;
			
		}
		
		@SuppressWarnings("unchecked") DorasGreatMapAdventure<K, E> y = (DorasGreatMapAdventure<K, E>) yobject;
		
		if (this.map.size() != y.map.size()) {
			
			return false;
			
		}
		
		Set<K> keyset = keySet();
		
		for (K key: keyset) {
			
			if (!y.containsKey(key) || !this.map.get(key).equals(y.map.get(key))) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public String toString() {
		
		if (size() == 0) {
			
			return "{}";
			
		}
		
		String out = "";
		
		for (Entry<K, Set<E>> set: map.entrySet()) {
			
			out += ", " + set.getKey().toString() + "=" + set.getValue().toString();
			
		}
		
		return "{" + out.substring(2) + "}";
		
	}
	
	@SuppressWarnings("unchecked") public E maxItem() {
		
		Comparable<E> max = (Comparable<E>) map.get(map.keySet().iterator().next()).iterator().next();
		
		for (E elemE: allElements()) {
			
			if (max.compareTo(elemE) < 0) {
				
				max = (Comparable<E>) elemE;
				
			}
			
		}
		
		return (E) max;
		
	}
	
	public Set<E> allUniqueElements() {
		
		HashSet<E> items = new HashSet<E>();
		
		for (Entry<K, Set<E>> entry: map.entrySet()) {
			
			items.addAll(entry.getValue());
			
		}
		
		return items;
		
	}
	
	public ArrayList<E> allElements() {
		
		ArrayList<E> items = new ArrayList<E>();
		
		for (Entry<K, Set<E>> entry: map.entrySet()) {
			
			items.addAll(entry.getValue());
			
		}
		
		return items;
		
	}
	
	public Map<K, Set<E>> map() {
		
		return map;
		
	}
	
}