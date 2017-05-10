package com.edhesive.lesson34;

public 
class Lesson_34_Activity_Two {

	   public static double average(int [] a)
	   {
		   double sum = 0;
		   double avg;
		   for(int j = 0; j < a.length; j++){
			   sum += a[j];
		   }
		   avg = sum/a.length;
		   return avg;
	  }

	  public static void main(String[] args)
	  {
	  }
}