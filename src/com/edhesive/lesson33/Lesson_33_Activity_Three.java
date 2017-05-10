package com.edhesive.lesson33;

public class Lesson_33_Activity_Three {
	public static void main(String[] args){
		int[] main = {0, 1, 2, 3};
		printit(main);
	}
	
	public static void printit(int[] x){
		for(int i = 0; i < x.length; i ++){
			System.out.print(x[i]+ " ");
		}
	}
}
