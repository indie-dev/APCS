package com.edhesive.lesson32;

public class Lesson_32_Activity_Two {
	public static void main(String[] args){
		
	}
	
	public static int monthNumDays(int monthNum){
		int[] list = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		if(monthNum > 12 || monthNum < 1){
			throw new IllegalArgumentException("The digit entered was invalid");
		}
		return list[monthNum - 1];
	}
	
	
	public static void monthDays(int monthNum){
		System.out.println(monthNumDays(monthNum));
	}
}
