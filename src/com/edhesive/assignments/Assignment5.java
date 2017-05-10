package com.edhesive.assignments;

import java.util.Scanner;

import com.edhesive.interfaces.Main;

public class Assignment5 implements Main{
	public static int YES = 0;
	public static int NO = 1;
	public static void main(String[] args){
		Assignment5 a5 = new Assignment5();
		a5.params(args);
	}
	int enter;
	int wrong;
	int right;
	@Override
	public void params(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String first = input.nextLine();
		System.out.println("Enter the replacement String:");
		String second = input.nextLine();
		if(first.length() - first.replace("%", "").length() > 1){
			System.out.println("Error: Incorrect characters");
		}else{
			if(first.contains("$")){
				first = first.replace("$", " ");
			}
			first = first.replace("%", second);
			System.out.println(first);
		}
	}
	
}
