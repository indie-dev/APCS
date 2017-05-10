package com.edhesive.lesson13;

import java.util.Scanner;

public class Lesson_13_Activity_Three {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		if( num1 > num2){
			System.out.println(num1);
		} else if( num1 == num2 ){
		    System.out.println("EQUAL");
		} else{
			System.out.println(num2);
		}
	}
}