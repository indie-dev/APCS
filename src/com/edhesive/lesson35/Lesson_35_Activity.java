package com.edhesive.lesson35;

import java.util.ArrayList;

import com.MApps.Softy.Main;

public class Lesson_35_Activity {
	public static int randomize(int min, int max){
		return (int)(Math.random() * (max - min)) + min;
	}
	
	public static int randomize(int max){
		return (int)(Math.random() * max);
	}
	
	public static double randomize(double min, double max){
		return Math.random() * (max - min) + min;
	}
	
	public static double randomize(double max){
		return Math.random() * max;
	}
	
	public static void main(String[] args){
		ArrayList<String> stuff = new ArrayList<String>();
		stuff.add("Z");
		stuff.add("f");
		stuff.add(2, "W");
		stuff.remove(1);
		stuff.add("x");
		System.out.println (stuff);
	}

}
