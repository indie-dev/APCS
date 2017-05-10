package com.edhesive.lesson13;

import java.util.Scanner;

public class Lesson_13_Activity_Five {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num1 = (int) (Math.random() *  12) + 1;
		int num2  = (int) (Math.random() * 12) + 1;
		System.out.println("Multiply "+num1+" and "+num2);
		int num3  = scanner.nextInt();
		if( num3 == (num1 * num2)){
			System.out.println("Correct!");
		}else{
			System.out.println("Wrong");
		}
	}
}