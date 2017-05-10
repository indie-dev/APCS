package com.edhesive.lesson14;

import java.util.Scanner;

public class Lesson_14_Activity_Two {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a >= 0 && b >= 0){
			System.out.println("Both are positive or zero.");
		}else{
			System.out.println("One or both are negative.");
		}
	}
}
