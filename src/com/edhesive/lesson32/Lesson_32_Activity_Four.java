package com.edhesive.lesson32;

public class Lesson_32_Activity_Four {
	public static void main(String[] args){
		realTime(6342);
	}
	
	public static void realTime(double time){
		int hours = (int) time / 3600;
		time = time % 3600;
		int minutes = (int)(time / 60);
		time = time % 60;
		int seconds = (int) time;
		System.out.println("Hours: "+hours+"\nMinutes: "+minutes+"\nSeconds: "+seconds);
	}
}
