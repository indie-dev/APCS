package com.edhesive.lesson13;

import java.util.Scanner;

public class Lesson_13_Activity_One {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num >= 0){
			System.out.println("Positive");
		}else{
			System.out.println("Negative");
		}
	}
}