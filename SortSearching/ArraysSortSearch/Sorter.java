/**
  * @author:
  * 
  * note:    Complete the compareTo and equals methods below.
  */
import java.text.DecimalFormat;
public class Student implements Comparable<Student> {
	
	private String name;
	private int id;
	private double gpa;
	
	// This is complete
	public Student(String name, int id, double gpa){
		
		this.name = name;
		this.id = id;
		this.gpa = gpa;
		
	}
	
	// The 3 accessors are complete
	public String getName() { 
		
		return name; 
		
	}
	
	public int getId() { 
		
		return id; 
	
	}
	
	public double getGpa() { 
		
		return gpa; 
		
	}
	
	// This method is complete
	public String toString() {
		
		String s = new String("");
		DecimalFormat fmt = new DecimalFormat("0.00");
		s = "gpa:" + fmt.format(getGpa()) + "\tname:" + getName() + "\tid:" + getId();
		return s;
		
	}
	
	// Write so that the students come out in ascending(non-descending) order
	// of GPAs. If the GPAs are equal, then the secondary sort criterion should 
	// be based on descending(non-ascending) order of the names.
	// Reminder: use the Double class to help determine "equality" for double primitives
	//				due to the imprecise nature of real numbers
	public int compareTo(Student otherStudent){
		
		int compared = new Double(this.gpa).compareTo(new Double(otherStudent.gpa));
		if (compared != 0) {
			
			return compared;
			
		}
		
		return -this.name.compareTo(otherStudent.name);
		
	}
	
	public boolean equals(Student otherObj){
		
		return this instanceof Student && otherObj instanceof Student && this.compareTo(otherObj) == 0;
		
	}
	
}
