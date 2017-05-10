package com.edhesive.lesson11;

import java.util.Scanner;

class Lesson_11_Activity_Four {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int x = scanner.nextInt();
		if(x % 2 == 0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}
}
