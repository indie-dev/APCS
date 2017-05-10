package com.edhesive.lesson14;

import java.util.Scanner;

public class Lesson_14_Activity_One {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int input = s.nextInt();
      if (input < 5 || input > 76) {
        System.out.println("True");
      } else {
        System.out.println("False");
      }
   }
}