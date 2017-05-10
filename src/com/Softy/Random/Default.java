package com.Softy.Random;

import java.util.Scanner;

public class Default {
	private static Scanner scanner;
	protected static void setScanner(Scanner mScanner) {
		// TODO Auto-generated method stub
		scanner = mScanner;
	}
	
	protected static Scanner get(){
		return scanner;
	}
	
	protected static boolean setAnswer(String answer, String equalsTo){
		return answer.equals(equalsTo);
	}
	
	/** @hide **/
	public static int getOne(){
		return 1;
	}
}
