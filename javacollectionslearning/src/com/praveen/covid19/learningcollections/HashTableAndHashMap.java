package com.praveen.covid19.learningcollections;

import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
/* Name of the class has to be "Main" only if the class is public. */
public class HashTableAndHashMap 
{ 
    public static void main(String args[]) 
    { 
        //----------hashtable ------------------------- 
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
        ht.put(101," ajay"); 
        ht.put(101,"Vijay"); 
        ht.put(102,"Ravi"); 
        ht.put(103,"Rahul"); 
     //   ht.put(null,"Praveen");
        System.out.println("-------------Hash table--------------"); 
        for (Map.Entry m:ht.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
  
        //----------------hashmap-------------------------------- 
        
        //Adding a comment
        //Adding it to new branch1.
        //Adding it to new Branch2.
        
        HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
        hm.put(101," ajay"); 
        hm.put(101,"Vijay"); 
        hm.put(102,"Ravi"); 
        hm.put(103,"Rahul");
        hm.put(null,"Praveen"); 
        System.out.println("-----------Hash map-----------"); 
        for (Map.Entry m:hm.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
    } 
} 
