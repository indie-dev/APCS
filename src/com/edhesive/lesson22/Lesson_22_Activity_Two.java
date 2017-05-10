package com.edhesive.lesson22;

import java.util.Scanner;

public class Lesson_22_Activity_Two {
	public static void main(String[] args){
		Scanner mScanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = mScanner.nextLine();
		String spaces = "";
		for(int i = 0; i < input.length(); i++){
			System.out.println(spaces + input.charAt(i));
			spaces += "\t";
		}
	}
}
