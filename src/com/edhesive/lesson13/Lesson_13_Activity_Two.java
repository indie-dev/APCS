package com.edhesive.lesson13;

import java.util.Scanner;

public class Lesson_13_Activity_Two {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if ( num >= 60 ){
			System.out.println("passing");
		}else {
			System.out.println("failing");
		}
	}
}
