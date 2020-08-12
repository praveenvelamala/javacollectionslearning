package com.praveen.covid19.learningcollections;

import com.praveen.utility.StringOperations;

public class TestingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("Praveen velamala ");
		String reverseString = StringOperations.revereStringWithStack(s);
		System.out.println(reverseString);
		
		
		Long l = System.currentTimeMillis();
		System.out.println(l);
		
		for (int i=2342;i<115000;i++)
		{
			Boolean di = isPrimary(i);
		}
	
		Long l2 = System.currentTimeMillis();
		System.out.println(l2);
		System.out.println(l2-l);
	}

	public static boolean isPrimary(int i) {
		if(factors(i) < 1)
			return true;
		return false;
	}

	public static int factors(int i) {
		int count = 0;
		for(int j=2; j<i; j++)
		{
			if(i%j == 0)
			{
				count++;
			}
		if (count >2)
			break;
		}
	return count;	
	}
	
	
}
