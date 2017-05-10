package com.edhesive.lesson13;

import java.util.Scanner;

public class Lesson_13_Activity_Four {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num == 0){
			System.out.println("F");
		}else if(num == 1){
			System.out.println("D");
		}else if(num == 2){
			System.out.println("C");
		}else if(num == 3){
			System.out.println("B");
		}else if(num == 4){
			System.out.println("A");
		}else if(num > 4){
			System.out.println("A");
		}else{
			System.out.println("F");
		}
	}
}