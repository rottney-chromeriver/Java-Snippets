// https://www.hackerrank.com/challenges/java-sort/problem
import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

// Complete the code
class SortById implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getId() - b.getId();
    }
}

class SortByFname implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getFname().compareTo(b.getFname());
    }
}

// Note:  this one sorts in DECREASING order!  (other two are INC)
class SortByCgpaDec implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.getCgpa() > b.getCgpa()) return -1;
        if (a.getCgpa() < b.getCgpa()) return 1;
        return 0;
    }
}

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}

        // the logic...
        Collections.sort(studentList, new SortById());
        Collections.sort(studentList, new SortByFname());
        Collections.sort(studentList, new SortByCgpaDec());
      
      	for(Student st: studentList) {
			System.out.println(st.getFname());
		}

	}
}
