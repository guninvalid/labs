//This scored a 100

//package Dora;

import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class DorasGreatMapAdventurePart2<K, E> extends DorasGreatMapAdventure<K, E> {
	
	public DorasGreatMapAdventurePart2(String type) {
		
		super(type);
		
	}
	
	private DorasGreatMapAdventurePart2() {
		
		this("tree");
		
	}
	
	public DorasGreatMapAdventurePart2<K, E> mapUnion(DorasGreatMapAdventure<K, E> y) {
		
		DorasGreatMapAdventurePart2<K, E> out = new DorasGreatMapAdventurePart2<K, E>();
		
		for (Entry<K, Set<E>> elem: this.map().entrySet()) {
			
			out.map().put(elem.getKey(), elem.getValue());
			
		}
		
		for (Entry<K, Set<E>> elem: y.map().entrySet()) {
			
			if (out.containsKey(elem.getKey())) {
				
				Set<E> set = out.map().get(elem.getKey());
				
				for (E setelem: elem.getValue()) {
					
					if (!set.contains(setelem)) {
						
						set.add(setelem);
						
					}
					
				}
				
			} else {
				
				out.map().put(elem.getKey(), elem.getValue());
				
			}
			
		}
		
		return out;
		
	}
	
	public DorasGreatMapAdventurePart2<K, E> mapIntersection(DorasGreatMapAdventure<K, E> y) {
		
		DorasGreatMapAdventurePart2<K, E> out = new DorasGreatMapAdventurePart2<K, E>();
		
		for (K key: this.map().keySet()) {
			
			if (y.containsKey(key)) {
				
				Set<E> thisset = this.map().get(key);
				Set<E> yset = this.map().get(key);
				
				for (E elem: thisset) {
					
					if (yset.contains(elem)) {
						
						out.add(key, elem);
						
					}
					
				}
				
			}
			
		}
		
		return out;
		
	}
	
	public DorasGreatMapAdventurePart2<K, E> mapDifference(DorasGreatMapAdventure<K, E> y) {
		
		DorasGreatMapAdventurePart2<K, E> out = new DorasGreatMapAdventurePart2<K, E>();
		
		for (Entry<K, Set<E>> entry: map().entrySet()) {
			
			if (y.containsKey(entry.getKey())) {
				
				Set<E> yset = y.map().get(entry.getKey());
				
				for (E elem: entry.getValue()) {
					
					if (!yset.contains(elem)) {
						
						out.add(entry.getKey(), elem);
						
					}
					
				}
				
			} else {
				
				for (E elem: entry.getValue()) {
					
					out.add(entry.getKey(), elem);
					
				}
				
			}
			
		}
		
		return out;
		
	}
	
	public boolean isSubmapOf(DorasGreatMapAdventure<K, E> y) {
		
		for (K key: keySet()) {
			
			if (y.containsKey(key)) {
				
				Set<E> yset = y.map().get(key);
				
				for (E elem: map().get(key)) {
					
					if (!yset.contains(elem)) {
						
						return false;
						
					}
					
				}
				
			} else {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public boolean isProperSubmapOf(DorasGreatMapAdventure<K, E> y) {
		
		return this.size() < y.size() && isSubmapOf(y);
		
	}
	
	public void clear() {
		
		map().clear();
		
	}
	
	public void clearKey(K key) {
		
		if (containsKey(key)) {
			
			map().replace(key, new TreeSet<E>());
			
		}
		
	}
	
	public int numMappings() {
		
		return keySet().size();
		
	}
	
}
