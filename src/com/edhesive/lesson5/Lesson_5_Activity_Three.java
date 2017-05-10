package com.edhesive.lesson5;

import java.util.Scanner;

class Lesson_5_Activity_Three {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter a radius: ");
    	int radius = s.nextInt();
    	System.out.println("Circumference: "+(2 * 3.14 * radius));
    	System.out.println("Area: "+(3.14 * radius * radius));
    }
}