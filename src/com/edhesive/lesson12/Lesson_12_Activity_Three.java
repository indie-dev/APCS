package com.edhesive.lesson12;

import java.util.Scanner;

public class Lesson_12_Activity_Three {
	public static void main(String[] args){
		System.out.println("Enter a test score:");
		Scanner scanner = new Scanner(System.in);
		double score = scanner.nextDouble();
		if(score < 100 && score > 0){
			System.out.println("Valid");
		}else{
			System.out.println("Not Valid");
		}
	}
}
