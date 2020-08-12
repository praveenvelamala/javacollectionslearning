package com.praveen.covid19.learningcollections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Student> studentSet = new LinkedHashSet<>();
		
		
		LinkedHashSet<Integer> ts = new LinkedHashSet();
		
		ts.add(3);
		ts.add(2);
		ts.add(null);
		ts.add(null);
		ts.add(1);
		ts.add(3);
		ts.add(0);
		ts.add(9);
		ts.add(7);
		ts.add(9);
		
		Iterator<Integer> i = ts.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		Student s1 = new Student("Praveen",1,"M");
		Student s2 = new Student("Kalyani",2,"F");
		Student s3 = new Student("Amar",4,"M");
		Student s4 = new Student("Raju",3,"M");
		Student s5 = new Student("Praveen",3,"M");
		Student s6 = new Student("Praveen",1,"M");
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		studentSet.add(s5);
		studentSet.add(s6);
		Iterator<Student> j = studentSet.iterator();
		
		while (j.hasNext()) {
			System.out.println(j.next());
		}
	}

	
	
	
}
