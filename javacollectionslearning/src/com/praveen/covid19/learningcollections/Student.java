package com.praveen.covid19.learningcollections;

import java.util.Comparator;

public class Student {

	public String name;
	public Integer id;
	public String gender;
	public Student(String name, Integer id, String gender) {
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
	
	public Student() {
		
	}
	
	public String getGender() {
		return gender;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id:"+this.getId()+"; Name:"+this.getName()+"; Gender: "+this.getGender();
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(this == arg0)
			return true;
		if(arg0 == null)
			return false;
		if(arg0.getClass()!=this.getClass())
			return false;
		Student temp = (Student)arg0;
		if(temp.getGender().equals(this.getGender()) && temp.getId().equals(this.getId()) && temp.getName().equals(this.getName()))
			return true;
		else 
			return false;
	}
	
	class Sortbyroll implements Comparator<Student> 
	{ 
	    // Used for sorting in ascending order of 
	    // roll number 
	    public int compare(Student a, Student b) 
	    { 
	        return a.getId() - b.getId(); 
	    } 
	} 
	

}
