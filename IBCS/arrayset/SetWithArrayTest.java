//I'm proud of this tester, ok?

//package ArraySet;

import java.util.ArrayList;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

public class SetWithArrayTest extends TestCase {
	
	private static final SetWithArray SETNULL = new SetWithArray(new int[] {});
	private static final SetWithArray SET1 = new SetWithArray(new int[] {1});
	private static final SetWithArray SET2 = new SetWithArray(new int[] {2});
	//private static final SetWithArray SET3 = new SetWithArray(new int[] {3});
	//private static final SetWithArray SET4 = new SetWithArray(new int[] {4});
	private static final SetWithArray SET12 = new SetWithArray(new int[] {1, 2});
	//private static final SetWithArray SET13 = new SetWithArray(new int[] {1, 3});
	//private static final SetWithArray SET14 = new SetWithArray(new int[] {1, 4});
	//private static final SetWithArray SET23 = new SetWithArray(new int[] {2, 3});
	//private static final SetWithArray SET24 = new SetWithArray(new int[] {2, 4});
	//private static final SetWithArray SET34 = new SetWithArray(new int[] {3, 4});
	//private static final SetWithArray SET123 = new SetWithArray(new int[] {1, 2, 3});
	//private static final SetWithArray SET124 = new SetWithArray(new int[] {1, 2, 4});
	//private static final SetWithArray SET134 = new SetWithArray(new int[] {1, 3, 4});
	//private static final SetWithArray SET234 = new SetWithArray(new int[] {2, 3, 4});
	//private static final SetWithArray SET1234 = new SetWithArray(new int[] {1, 2, 3, 4});
	
	private static final SetWithArray[] SETS2 = new SetWithArray[] {
			
			SETNULL, SET1, SET2, SET12
			
	};
	
	/*private static final SetWithArray[] SETS3 = new SetWithArray[] {
			
			SETNULL, SET1, SET2, SET3, SET12, SET13, SET23, SET123,
			
	};
	
	private static final SetWithArray[] SETS4 = new SetWithArray[] {
			
			SETNULL, SET1, SET2, SET3, 
			SET4, SET12, SET13, SET14, 
			SET23, SET24, SET34, SET123, 
			SET124, SET134, SET234, SET1234, 
			
	};**/
	
	public SetWithArrayTest() {
		
		
		
	}
	
	public void testSetWithArrayUnion00() {
		
		SetWithArray[] answers = new SetWithArray[] {
				
				SETNULL, SET1, SET2, SET12,
				SET1, SET1, SET12, SET12,
				SET2, SET12, SET2, SET12,
				SET12, SET12, SET12, SET12,
				
		};
		
		int counter = 0;
		
		for (SetWithArray set: SETS2) {
			
			for (SetWithArray elem: SETS2) {
				
				assert(answers[counter].equals(set.union(elem)));
				counter++;
				
			}
			
		}
		
	}
	
	public void testSetWithArrayIntersection00() {
		
		SetWithArray[] answers = new SetWithArray[] {
				
				SETNULL, SETNULL, SETNULL, SETNULL, 
				SETNULL, SET1, SETNULL, SET1,
				SETNULL, SETNULL, SET2, SET2,
				SETNULL, SET1, SET2, SET12,
				
		};
		
		int counter = 0;
		
		for (SetWithArray set: SETS2) {
			
			for (SetWithArray elem: SETS2) {
				
				assert(answers[counter].equals(set.intersection(elem)));
				counter++;
				
			}
			
		}
		
	}
	
	public void testSetWithArrayDifference00() {
		
		SetWithArray[] se = new SetWithArray[] {
				
				SETNULL, SETNULL, SETNULL, SETNULL,
				SET1, SETNULL, SET1, SETNULL,
				SET2, SET2, SETNULL, SETNULL,
				SET12, SET2, SET1, SETNULL
				
		};
		
		int counter = 0;
		
		for (SetWithArray set: SETS2) {
			
			for (SetWithArray elem: SETS2) {
				
				assert(se[counter].equals(set.difference(elem)));
				counter++;
				
			}
			
		}
		
	}
	
	public void testSetWithArrayIsSubSetOf00() {
		
		boolean[] answers = new boolean[] {
				
				true, true, true, true, 
				false, true, false, true, 
				false, false, true, true, 
				false, false, false, true
				
		};
		
		int counter = 0;
		
		for (SetWithArray set: SETS2) {
			
			for (SetWithArray elem: SETS2) {
				
				assert(set.isSubSetOf(elem) == answers[counter]);
				counter++;
				
			}
			
		}
		
	}
	
	public void testSetWithArrayIsEqualTo00() {
		
		boolean[] answers = new boolean[] {
				
				true, false, false, false,
				false, true, false, false, 
				false, false, true, false, 
				false, false, false, true
				
		};
		
		int counter = 0;
		
		for (SetWithArray set: SETS2) {
			
			for (SetWithArray elem: SETS2) {
				
				assert(set.equals(elem) == answers[counter]);
				counter++;
				
			}
			
		}
		
	}
	
	public void testSetWithArraySymmetricDifference00() {
		
		SetWithArray[] se = new SetWithArray[] {
				
				SETNULL, SET1, SET2, SET12, 
				SET1, SETNULL, SET12, SET2, 
				SET2, SET12, SETNULL, SET1,
				SET12, SET2, SET1, SETNULL
				
		};
		
		int counter = 0;
		
		for (SetWithArray set: SETS2) {
			
			for (SetWithArray elem: SETS2) {
				
				assert(se[counter].equals(set.symmetricDifference(elem)));
				counter++;
				
			}
			
		}
		
	}
		
	public void testSetWithArrayisPartition00() {
		
		boolean[] answers = new boolean[] {
				
				//setnull
				true, false, false, false,
				false, false, false, false,
				false, false, false, false,
				false, false, false, false,
				
				//set1
				false, true, false, false, 
				true, false, false, false,
				false, false, false, false,
				false, false, false, false,
				
				//set2
				false, false, true, false,
				false, false, false, false,
				true, false, false, false,
				false, false, false, false,
				
				//set12
				false, false, false, true, 
				false, false, true, false,
				false, true, false, false,
				true, false, false, false,
				
		};
		
		int counter = 0;
		
		for (SetWithArray set: SETS2) {
			
			for (SetWithArray ind1: SETS2) {
				
				for (SetWithArray ind2: SETS2) {
					
					List<int[]> why = new ArrayList<int[]>();
					why.add(ind1.x());
					why.add(ind2.x());
					assert(set.isPartition(why) == answers[counter]);
					counter++;
					
				}
				
			}
			
		}
		
	}
	
}