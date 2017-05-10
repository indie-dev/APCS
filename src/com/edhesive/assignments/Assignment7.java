package com.edhesive.assignments;

import java.util.Scanner;

public class Assignment7 {
	public static int[] convertToBinary(int a){
		int [] bin = {0,0,0,0,0,0,0,0};
		for(int i = bin.length-1; i >= 0; i--){
		 bin[i] = a%2;
		 a = a/2;
		}
		return bin;
	}
	
	public static void printBin(int[] b){
		int x;
		for(int z=0; z < b.length; z++){
			System.out.print(b[z] + " ");
		}
		
		System.out.println();
	}
	
	public static int[] addBin(int[] c, int[] d){
		int[] added = new int[8];
		int remain = 0;
		for(int x = added.length -1; x>=0; x--){
			added[x] = (c[x] + d[x] + remain) % 2;
			remain = (c[x] + d[x] + remain) / 2;
		}
		if(added[0] + c[0] + d[0] == 1){
			added[0] = 1;
		}
		else if((added[0] + c[0] + d[0] == 2) || (added[0] + c[0] + d[0] == 3)){
			System.out.println("Error: overflow");
		}
		return added;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a base ten number between 0 and 255, inclusive");
		int num1 = scanner.nextInt();
		System.out.println("Enter a base ten number between 0 and 255, inclusive.");
		int num2 = scanner.nextInt();
		
		int[] bin = convertToBinary(num1);
		System.out.println("First binary number:");
		printBin(bin);
		int[] bin1 = bin;
		
		bin = convertToBinary(num2);
		System.out.println("Second binary number:");
		printBin(bin);
		int[] bin2 = bin;
		
		System.out.println("Added:");
		{
			printBin(addBin(bin1, bin2));
		}
	}
}

