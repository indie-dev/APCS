package com.edhesive.lesson32;

public class Lesson_32_Activity_One {
	public static void main(String[] args){
		monthName(8);
	}
	public static void monthName(int num){
		String[] month = {"January","February","March", "April","May","June","July","August","September","October","November","December"};
		System.out.println(month[num -1]);
	}
}
