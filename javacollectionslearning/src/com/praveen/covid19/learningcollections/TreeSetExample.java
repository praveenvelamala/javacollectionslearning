package com.praveen.covid19.learningcollections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Student> studentMap = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {
				// TODO Auto-generated method stub
				if(arg0.getId() - arg0.getId() == 0) {
					return arg0.getName().compareTo(arg1.getName());
				}
				return arg0.getId()-arg1.getId();
			}
			
		});
		
		
		TreeSet<Integer> ts = new TreeSet();
		
		ts.add(3);
		ts.add(2);
//		ts.add(null);
//		ts.add(null);
		ts.add(1);
		ts.add(3);
		
		Iterator<Integer> i = ts.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		Student s1 = new Student("Praveen",1,"M");
		Student s2 = new Student("Kalyani",2,"F");
		Student s3 = new Student("Amar",4,"M");
		Student s4 = new Student("Raju",3,"M");
		Student s5 = new Student("Praveen",3,"M");
		Student s6 = new Student("Praveen",2,"M");
		studentMap.add(s1);
		studentMap.add(s2);
		studentMap.add(s3);
		studentMap.add(s4);
		studentMap.add(s5);
		studentMap.add(s6);
		Iterator<Student> j = studentMap.iterator();
		
		while (j.hasNext()) {
			System.out.println(j.next());
		}
	}

	
	
	
}
