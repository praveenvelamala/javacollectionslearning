package com.praveen.utility;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringOperations {

	public static String revereStringWithStack(String str) {
		if(str == null) {
			return str;
		}
				
		int length = str.length();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0 ;i<length;i++) {
			stack.push(str.charAt(i));
		}
		
//		StringBuilder sb = new StringBuilder();
//		for(int i=0;i<length;i++) {
//			sb.append(stack.pop());
//		}
//		String reverseStringWithSB = sb.toString();
		
		List<Character> al = new ArrayList();
		for(int i=0;i<length;i++) {
			al.add(stack.pop());
		}
		String reverseStringWithAL = al.toString();

		return reverseStringWithAL;
	}
}
