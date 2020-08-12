package com.praveen.covid19.learningcollections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSorting {

	public static void main(String args[]) {
		List<Student> studentList = new ArrayList<>();
		
		Student s1 = new Student("Praven",1,"M");
		Student s2 = new Student("Kalyani",2,"F");
		Student s3 = new Student("Amar",5,"M");
		Student s4 = new Student("Raju",3,"M");
		Student s5 = new Student("Roopa",4,"F");
		Student s6 = new Student("Praveen",1,"M");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		
		for(int i=0;i< 6;i++) {
			System.out.println(studentList.get(i));
		}
		Collections.sort((List<Student>) studentList, new Comparator<Student>(){

			@Override
			public int compare(Student arg0, Student arg1) {
				return arg0.getId()-arg1.getId();
				
			}
		
		}  );
		
		for(int i=0;i< 6;i++) {
			System.out.println(studentList.get(i));
		}
		
	}
}
