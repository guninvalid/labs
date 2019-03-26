/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

import java.util.Arrays;

public final class Sorter {
	
	public static long sortViaJavaArraysClass(Comparable[] vec){
		
		StopWatch timer = new StopWatch();
		timer.start();
		
		Arrays.sort(vec);
		
		timer.stop();
		return timer.getElapsedTime();
		
	}
	
	public static long sortViaInsertion(Comparable[] array){
		
		StopWatch timer = new StopWatch();
		timer.start();	
		
		for (int i = 1; i < array.length; i++) {
			
			insert(array, i);
			
		}
		
		timer.stop();
		return timer.getElapsedTime();
		
	}
	
	public static long sortViaSelection(Comparable[] array){
		
		StopWatch timer = new StopWatch();
		timer.start();
		
		for (int i = 0; i < array.length - 1; i++) {
			
			swap(array, i, indexOfSmallest(array, i));
			
		}
		
		timer.stop();
		return timer.getElapsedTime();
	
	}
	
	public static long sortViaMerge(Comparable[] array){
		
		StopWatch timer = new StopWatch();
		timer.start();
		
		mergeSort(array);
		
		timer.stop();
		return timer.getElapsedTime();
		
	}
	
	public static int indexOfSmallest(Comparable[] array, int initial) {
		
		int index = initial;
		Comparable min = array[initial];
		for (int j = initial + 1; j < array.length; j++) {
			
			if (min.compareTo(array[j]) > 0) {
				
				min = array[j];
				index = j;
				
			}
			
		}
		return index;
		
	}
	
	public static void swap(Object[] array, int initial, int finish) {
		
		Object tmp = array[initial];
		array[initial] = array[finish];
		array[finish] = tmp;
		
	}
	
	public static void shiftRight(Object[] array, int initial, int finish) {
		
		for (int i = finish; i > initial; i--) {
			
			array[i] = array[i - 1];
			
		}
		
	}
	
	public static void insert(Comparable[] array, int insertedObj) {
		
		Comparable insertion = array[insertedObj];
		int insertTo;
		
		for (insertTo = insertedObj; insertTo > 0; insertTo--) {
			
			if (insertion.compareTo(array[insertTo - 1]) > 0) {
				
				break;
				
			}
			
		}
		
		insert(array, insertTo, insertedObj, insertion);
		
	}
	
	public static void insert(Object[] array, int initial, int finish, Object inserted) {
		
		shiftRight(array, initial, finish);
		array[initial] = inserted;
		
	}
	
	public static void mergeSort(Comparable[] array, int left, int right) {
		
		if (left >= right) {
			
			return;
			
		}
		
		int mid = (left + right) / 2;
		mergeSort(array, left, mid);
		mergeSort(array, mid + 1, right);
		
		merge(array, left, mid, right);
		
	}
	
	public static void merge(Comparable[] array, int left, int mid, int right) {
		
		int l = left;
		int r = mid + 1;
		int i = left;
		Comparable[] sort = new Comparable[array.length];
		
		while (l <= mid && r <= right) {
			
			if (array[l].compareTo(array[r]) < 0) {
				
				sort[i++] = array[l++];
				
			} else {
				
				sort[i++] = array[r++];
				
			}
			
		}
		
		while (l <= mid) {
			
			sort[i++] = array[l++];
			
		}
		
		while (r <= right) {
			
			sort[i++] = array[r++];
			
		}
		
		for (int j = left; j <= right; j++) {
			
			array[j] = sort[j];
			
		}
		
		
	}
	
	public static void mergeSort(Comparable[] array) {
		
		mergeSort(array, 0, array.length - 1);
		
	}
	
}
