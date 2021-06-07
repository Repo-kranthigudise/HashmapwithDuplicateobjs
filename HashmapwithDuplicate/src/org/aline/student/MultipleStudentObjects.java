package org.aline.student;

import java.util.HashMap;

public class MultipleStudentObjects {
	public static void main(String[] args) {

		HashMap<Integer, Student> stdhashmap = new HashMap<>();

		Student s1 = new Student(1, "kranthi", "cse");
		Student s2 = new Student(2, "srinivas", "cse");
		Student s3 = new Student(3, "naresh", "cse");
		Student s4 = new Student(4, "mahesh", "cse");
		Student s5 = new Student(5, "suresh", "cse");
		Student s6 = new Student(6, "kranthi", "cse");
		Student s7 = new Student(7, "mukes", "cse");
		stdhashmap.put(1, s1);
		stdhashmap.put(2, s2);
		stdhashmap.put(3, s3);
		stdhashmap.put(4, s4);
		stdhashmap.put(5, s5);
		stdhashmap.put(6, s1);
		stdhashmap.put(7, s1);
		stdhashmap.put(8, s6);
		stdhashmap.put(9, s7);

		for (Student studentMap : stdhashmap.values()) {
			System.out.println(studentMap);

		}

	}

}
