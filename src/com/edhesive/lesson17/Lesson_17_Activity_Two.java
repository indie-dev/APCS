package com.edhesive.lesson17;

import java.util.Scanner;

public class Lesson_17_Activity_Two {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int one = scanner.nextInt();
		int two = scanner.nextInt();
		int three;
		for ( int i = one; i <= two; i++){
			if(i % 2 == 0){
				System.out.println(i+ " ");
			}
		}
	}
}
