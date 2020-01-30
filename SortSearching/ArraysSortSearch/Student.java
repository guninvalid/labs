import java.text.DecimalFormat;

public class Student implements Comparable {
	
	private String name;
	private int id;
	private double gpa;
	
	//default constructor
	public Student(String pname, int pid, double pgpa){
		
		this.name = pname;
		this.id = pid;
		this.gpa = pgpa;
	}
	
	//some accessor methods
	public String getName() {
		
		return this.name;
		
	}
	
	public int getId() {
		
		return this.id;
		
	}
	
	public double getGpa() {
		
		return this.gpa;
		
	}
	
	//given
	public String toString() {
		
		String s = new String("");
		DecimalFormat fmt = new DecimalFormat("0.00");
		s = "gpa:" + fmt.format(this.gpa) + " name:" + this.name + " id:" + this.id;
		return s;
		
	}
	
	//compare by greater gpa first, then by lesser name
	public int compareTo(Object pthat) {
		
		//compare gpa
		Student that = (Student) pthat;
		int comp = new Double(this.gpa).compareTo(new Double(that.gpa));
		
		//if gpa equal
		if (comp == 0) {
			
			//compare name
			return that.name.compareTo(this.name);
			
		}
		
		return comp;
		
	}
	
	//null check then compare using compareTo
	public boolean equals(Object that) {
		
		return that != null && this.compareTo((Student) that) == 0;
		
	}
	
}
