package com.edhesive.lesson12;

import java.util.Scanner;

public class Lesson_12_Activity_Four {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the temperature?");
		double temp = scanner.nextDouble();
		if(temp >= 99 && temp <=102){
			System.out.println("");
		}else{
			System.out.println("WARNING");
		}
	}
}
