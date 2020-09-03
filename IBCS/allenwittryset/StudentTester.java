//Another tester I'm also proud of. It's more comprehensive then Mr Allen's.

//package allenwittryset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentTester extends junit.framework.TestCase {
	
	public static final AllenWittrySet<Integer> SETNULL = new AllenWittrySet<Integer>(new Integer[] {});
	public static final AllenWittrySet<Integer> SET1 = new AllenWittrySet<Integer>(new Integer[] {1});
	public static final AllenWittrySet<Integer> SET2 = new AllenWittrySet<Integer>(new Integer[] {2});
	public static final AllenWittrySet<Integer> SET12 = new AllenWittrySet<Integer>(new Integer[] {1, 2});
	
	public void testAddAndSize01() {
		
		assert(SETNULL.size() == 0);
		assert(SET1.size() == 1);
		assert(SET2.size() == 1);
		assert(SET12.size() == 2);
		AllenWittrySet<Integer> set = new AllenWittrySet<Integer>("tree");
		assert(set.size() == 0);
		set.add(1);
		assert(set.size() == 1);
		set.add(2);
		assert(set.size() == 2);
		set.add(3);
		assert(set.size() == 3);
		set.add(1);
		assert(set.size() == 3);
		set.add(3);
		assert(set.size() == 3);
		
	}
	
	public void testAddAndContains01() {
		
		assert(!SETNULL.contains(0));
		assert(!SETNULL.contains(1));
		assert(!SETNULL.contains(2));
		assert(!SET1.contains(0));
		assert(SET1.contains(1));
		assert(!SET1.contains(2));
		assert(!SET2.contains(0));
		assert(!SET2.contains(1));
		assert(SET2.contains(2));
		assert(!SET12.contains(0));
		assert(SET12.contains(1));
		assert(SET12.contains(2));
		
		AllenWittrySet<Integer> set = new AllenWittrySet<Integer>("tree");
		assert(!set.contains(0));
		assert(!set.contains(1));
		assert(!set.contains(2));
		assert(!set.contains(3));
		set.add(1);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(!set.contains(2));
		assert(!set.contains(3));
		set.add(3);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(!set.contains(2));
		assert(set.contains(3));
		set.add(4);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(!set.contains(2));
		assert(set.contains(3));
		set.add(25565);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(!set.contains(2));
		assert(set.contains(3));
		set.add(2);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(set.contains(2));
		assert(set.contains(3));
		
	}
	
	public void testIsProperSubsetOf01() {
		
		assert(!SETNULL.isProperSubsetOf(SETNULL));
		assert(SETNULL.isProperSubsetOf(SET1));
		assert(SETNULL.isProperSubsetOf(SET2));
		assert(SETNULL.isProperSubsetOf(SET12));
		assert(!SET1.isProperSubsetOf(SETNULL));
		assert(!SET1.isProperSubsetOf(SET1));
		assert(!SET1.isProperSubsetOf(SET2));
		assert(SET1.isProperSubsetOf(SET12));
		assert(!SET2.isProperSubsetOf(SETNULL));
		assert(!SET2.isProperSubsetOf(SET1));
		assert(!SET2.isProperSubsetOf(SET2));
		assert(SET2.isProperSubsetOf(SET12));
		assert(!SET12.isProperSubsetOf(SETNULL));
		assert(!SET12.isProperSubsetOf(SET1));
		assert(!SET12.isProperSubsetOf(SET2));
		assert(!SET12.isProperSubsetOf(SET12));
		
	}
	
	public void testIsSubsetOf01() {
		
		assert(SETNULL.isSubsetOf(SETNULL));
		assert(SETNULL.isSubsetOf(SET1));
		assert(SETNULL.isSubsetOf(SET2));
		assert(SETNULL.isSubsetOf(SET12));
		assert(!SET1.isSubsetOf(SETNULL));
		assert(SET1.isSubsetOf(SET1));
		assert(!SET1.isSubsetOf(SET2));
		assert(SET1.isSubsetOf(SET12));
		assert(!SET2.isSubsetOf(SETNULL));
		assert(!SET2.isSubsetOf(SET1));
		assert(SET2.isSubsetOf(SET2));
		assert(SET2.isSubsetOf(SET12));
		assert(!SET12.isSubsetOf(SETNULL));
		assert(!SET12.isSubsetOf(SET1));
		assert(!SET12.isSubsetOf(SET2));
		assert(SET12.isSubsetOf(SET12));
		
	}
	
	public void testEquals01() {
		
		assert(SETNULL.equals(SETNULL));
		assert(!SETNULL.equals(SET1));
		assert(!SETNULL.equals(SET2));
		assert(!SETNULL.equals(SET12));
		assert(!SET1.equals(SETNULL));
		assert(SET1.equals(SET1));
		assert(!SET1.equals(SET2));
		assert(!SET1.equals(SET12));
		assert(!SET2.equals(SETNULL));
		assert(!SET2.equals(SET1));
		assert(SET2.equals(SET2));
		assert(!SET2.equals(SET12));
		assert(!SET12.equals(SETNULL));
		assert(!SET12.equals(SET1));
		assert(!SET12.equals(SET2));
		assert(SET12.equals(SET12));
		
	}
	
	public void testRemove01() {
		
		AllenWittrySet<Integer> set = new AllenWittrySet<Integer>("tree");
		assert(!set.contains(0));
		assert(!set.contains(1));
		assert(!set.contains(2));
		assert(!set.contains(3));
		set.add(1);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(!set.contains(2));
		assert(!set.contains(3));
		set.add(3);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(!set.contains(2));
		assert(set.contains(3));
		set.add(4);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(!set.contains(2));
		assert(set.contains(3));
		set.add(25565);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(!set.contains(2));
		assert(set.contains(3));
		set.add(2);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(set.contains(2));
		assert(set.contains(3));
		set.remove(65536);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(set.contains(2));
		assert(set.contains(3));
		set.remove(2);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(!set.contains(2));
		assert(set.contains(3));
		set.remove(0);
		assert(!set.contains(0));
		assert(set.contains(1));
		assert(!set.contains(2));
		assert(set.contains(3));
		set.remove(1);
		assert(!set.contains(0));
		assert(!set.contains(1));
		assert(!set.contains(2));
		assert(set.contains(3));
		set.remove(3);
		assert(!set.contains(0));
		assert(!set.contains(1));
		assert(!set.contains(2));
		assert(!set.contains(3));
		
	}
	
	public void testToArray01() {
		
		String problemMessage = "testToArray test 1";
		AllenWittrySet<String> first = new AllenWittrySet<String>("tree");
		
		Object[] myArray = first.toArray();
		assertEquals(0, myArray.length);
		
	}
	
	public void testSetDifference01() {
		
		assert(SETNULL.setDifference(SETNULL).equals(new Integer[] {}));
		assert(SETNULL.setDifference(SET1).equals(new Integer[] {}));
		assert(SETNULL.setDifference(SET2).equals(new Integer[] {}));
		assert(SETNULL.setDifference(SET12).equals(new Integer[] {}));
		assert(SET1.setDifference(SETNULL).equals(new Integer[] {1}));
		assert(SET1.setDifference(SET1).equals(new Integer[] {}));
		assert(SET1.setDifference(SET2).equals(new Integer[] {1}));
		assert(SET1.setDifference(SET12).equals(new Integer[] {}));
		assert(SET2.setDifference(SETNULL).equals(new Integer[] {2}));
		assert(SET2.setDifference(SET1).equals(new Integer[] {2}));
		assert(SET2.setDifference(SET2).equals(new Integer[] {}));
		assert(SET2.setDifference(SET12).equals(new Integer[] {}));
		assert(SET12.setDifference(SETNULL).equals(new Integer[] {1, 2}));
		assert(SET12.setDifference(SET1).equals(new Integer[] {2}));
		assert(SET12.setDifference(SET2).equals(new Integer[] {1}));
		assert(SET12.setDifference(SET12).equals(new Integer[] {}));
		
	}
	
	public void testIntersection01() {
		
		assert(SETNULL.setIntersection(SETNULL).equals(new Integer[] {}));
		assert(SETNULL.setIntersection(SET1).equals(new Integer[] {}));
		assert(SETNULL.setIntersection(SET2).equals(new Integer[] {}));
		assert(SETNULL.setIntersection(SET12).equals(new Integer[] {}));
		assert(SET1.setIntersection(SETNULL).equals(new Integer[] {}));
		assert(SET1.setIntersection(SET1).equals(new Integer[] {1}));
		assert(SET1.setIntersection(SET2).equals(new Integer[] {}));
		assert(SET1.setIntersection(SET12).equals(new Integer[] {1}));
		assert(SET2.setIntersection(SETNULL).equals(new Integer[] {}));
		assert(SET2.setIntersection(SET1).equals(new Integer[] {}));
		assert(SET2.setIntersection(SET2).equals(new Integer[] {2}));
		assert(SET2.setIntersection(SET12).equals(new Integer[] {2}));
		assert(SET12.setIntersection(SETNULL).equals(new Integer[] {}));
		assert(SET12.setIntersection(SET1).equals(new Integer[] {1}));
		assert(SET12.setIntersection(SET2).equals(new Integer[] {2}));
		assert(SET12.setIntersection(SET12).equals(new Integer[] {1, 2}));
		
	}
	
	public void testAdd01() {
		
		String problemMessage = "Add test 1";
		AllenWittrySet<String> first = new AllenWittrySet<String>("tree");
		Set<String> second = new TreeSet<String>();
		first.add("1");
		first.add("2");
		first.add("3");
		first.add("4");
		first.add("5");
		first.add("6");
		
		second.add("1");
		second.add("2");
		second.add("3");
		second.add("4");
		second.add("5");
		second.add("6");
		
		assertEquals(6, first.size());
		Iterator<String> iter = first.iterator();
		while (iter.hasNext()) {
			
			assertEquals(true, second.contains(iter.next()));
			
		}
		
	}
	
	public void testSize01() {
		
		String problemMessage = "Size test 1";
		AllenWittrySet<Integer> first = new AllenWittrySet<Integer>("tree");
		int someValue = 0;
		
		for (int i = 0; i < someValue; i++) {
			
			first.add(new Integer(i));
			
		}
		
		assertEquals(someValue, first.size());
		
	}
	
	public void testUnion01() {
		
		assert(SETNULL.setUnion(SETNULL).equals(new Integer[] {}));
		assert(SETNULL.setUnion(SET1).equals(new Integer[] {1}));
		assert(SETNULL.setUnion(SET2).equals(new Integer[] {2}));
		assert(SETNULL.setUnion(SET12).equals(new Integer[] {1, 2}));
		assert(SET1.setUnion(SETNULL).equals(new Integer[] {1}));
		assert(SET1.setUnion(SET1).equals(new Integer[] {1}));
		assert(SET1.setUnion(SET2).equals(new Integer[] {1, 2}));
		assert(SET1.setUnion(SET12).equals(new Integer[] {1, 2}));
		assert(SET2.setUnion(SETNULL).equals(new Integer[] {2}));
		assert(SET2.setUnion(SET1).equals(new Integer[] {1, 2}));
		assert(SET2.setUnion(SET2).equals(new Integer[] {2}));
		assert(SET2.setUnion(SET12).equals(new Integer[] {1, 2}));
		assert(SET12.setUnion(SETNULL).equals(new Integer[] {1, 2}));
		assert(SET12.setUnion(SET1).equals(new Integer[] {1, 2}));
		assert(SET12.setUnion(SET2).equals(new Integer[] {1, 2}));
		assert(SET12.setUnion(SET12).equals(new Integer[] {1, 2}));
		
	}
	
	public void testIsEmpty01() {
		
		assert(SETNULL.isEmpty());
		assert(!SET1.isEmpty());
		assert(!SET2.isEmpty());
		assert(!SET12.isEmpty());
		
	}
	
	public void testToString01() {
		
		String problemMessage = "toString test 1";
		AllenWittrySet<Integer> first = new AllenWittrySet<Integer>("tree");
		int someValue = 0;
		
		for (int i = 0; i < someValue; i++) {
			
			first.add(new Integer(i));
			
		}
		
		assertEquals("[]", first.toString());
		
	}
	
}