package com.edhesive.lesson24;

import java.util.Scanner;

public class Lesson_24_Activity_Three {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 100:");
		int in = scanner.nextInt();
		if( in < 0 || in > 100){
			System.out.println("Error");
		} else {
			for (int i = in; i < 100; i ++){
				System.out.append(i + " ");
				if(0 == (i - in + 1) % 20){
					System.out.println("");
				}
			}
		}
	}
}
