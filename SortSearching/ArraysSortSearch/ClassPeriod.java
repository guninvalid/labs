/*
 *
 *@author: Allen Liu
 *
 *note: Some of the methods below are for you to complete.
 */

public class ClassPeriod {
	
	private int myNumStudents;
	private Student[] myStudents;
	private String myClassName;
	private int length;
	
	public static void main(String[] args) {
		
		ClassPeriod p1 = new ClassPeriod("hi");
		ArrayRecordsSortSearchApplication.readClass(p1, "students15.txt");
		System.out.println(p1);
		Sorter.mergeSort(p1.myStudents);
		System.out.println(p1);
		
	}
	
	public ClassPeriod(String classname) {
		
		myClassName = classname;
		myNumStudents = 0;
		length = 10;
		myStudents = new Student[length];
		
	}
	
	//add the Student to the myStudents vector. If the vector is full, create a new
	//one twice the size of the current one. Update myNumStudents accordingly.
	public void addStudent(Student student) {
		
		if (!(student instanceof Student)) {
			
			return;
			
		}
		
		if (myNumStudents == length) {
			
			length *= 2;
			Student[] tmp = myStudents;
			myStudents = new Student[length];
			for (int i = myNumStudents - 1; i >= 0; i--) {
				
				myStudents[i] = tmp[i];
				
			}
			
		}
		
		myStudents[myNumStudents++] = student;
		
	}
	
	//Call the public findStudent method. Then, if the student is there, 
	//remove student from the array, moving all other elements accordingly. 
	public void removeStudent(Student student) {
		
		if (!(student instanceof Student)) {
			
			return;
			
		}
		
		int loc = findStudent(student.getId());
		
		if (loc == -1) {
			
			return;
			
		}
		
		myStudents[loc] = null;
		for (int i = loc + 1; i < myNumStudents; i++) {
			
			Student tmp = myStudents[i];
			myStudents[i] = myStudents[i - 1];
			myStudents[i - 1] = tmp;
			
		}
		myNumStudents--;
		
	}
	
	//This method is complete.
	//Create a NEW array of Students and return it.
	public Student[] getStudents() {
		
		Student tmp[] = new Student[myNumStudents];
		for(int i = 0; i < myNumStudents; i++) {
			
			tmp[i] = myStudents[i]; 
			
		}
		return tmp;
		
	}
	
	public int getNumStudents() {
		
		return myNumStudents;
		
	}
	
	//This method is complete.
	//Each Student object should be on a line by itself. You
	//should allow the Student class to determine its own
	//String value (this makes your current job easy!). Also,
	//the class name should be on the first line.
	public String toString() {
		
		String s = new String(myClassName+"\n");
		int i;
		for(i = 0; i < myNumStudents - 1; i++) {
			
			if ((myStudents[i] instanceof Student)) {
				
				s += myStudents[i].toString()+"\n";
				
			}
			
		}
		s += myStudents[myNumStudents - 1];
		return s;
		
	}
	
	//Since our students are in no particular order within the array, 
	//use a Linear/Sequential search to find the student with the id. Return 
	//the array location where the id is found, otherwise -1 if not found. 
	public int findStudent(int id) {
		
		for (int i = 0; i < myNumStudents; i++) {
			
			if (myStudents[i] instanceof Student && myStudents[i].getId() == id) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	public void clear() {
		
		myStudents = new Student[10];
		myNumStudents = 0;
		length = 10;
		
	}
	
}