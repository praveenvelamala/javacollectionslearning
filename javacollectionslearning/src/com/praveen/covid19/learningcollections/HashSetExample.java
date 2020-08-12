package com.praveen.covid19.learningcollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

//		HashSet<String> hs = new HashSet();
//		
//		hs.add("Praveen");
//		hs.add("Kumar");
//		hs.add(null);
//		hs.add(null);
//		hs.add("praveen");
//		hs.add("kumar");
//		
//		Iterator<String> i = hs.iterator();
//		
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
//		HashSet<Student> studentMap = new HashSet();
//		Student s1 = new Student("Praven",1,"M");
//		Student s2 = new Student("Kalyani",2,"F");
//		Student s3 = new Student("Amar",4,"M");
//		Student s4 = new Student("Raju",3,"M");
//		Student s5 = new Student("Raju",3,"M");
//		Student s6 = new Student("Praven",1,"M");
//	
//		studentMap.add(s1);
//		studentMap.add(s2);
//		studentMap.add(s3);
//		studentMap.add(s4);
//		studentMap.add(s5);
//		studentMap.add(s6);
//		
//		Iterator<Student> j = studentMap.iterator();
//		
//		while (j.hasNext()) {
//			System.out.println(j.next());
//		}
//	
		
		/* output
		 Id:4; Name:Amar; Gender: M
		Id:1; Name:Praven; Gender: M
		Id:3; Name:Raju; Gender: M
		Id:1; Name:Praven; Gender: M
		Id:2; Name:Kalyani; Gender: F
		Id:3; Name:Raju; Gender: M 
		  
		 */
		
		HashSet<Integer> hs = new HashSet();
		
		hs.add(1);
		hs.add(2);
		hs.add(null);
		hs.add(null);
		hs.add(1);
		hs.add(3);
		
		Iterator<Integer> i = hs.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
