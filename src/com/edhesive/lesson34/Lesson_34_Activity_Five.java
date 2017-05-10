package com.edhesive.lesson34;

public 
class Lesson_34_Activity_Five {

	   public static int sumEven(int [] a)
	    {
	      int sum = 0;
	      for(int j = 0; j < a.length; j++){
	        if(a[j] % 2 == 0){
	          sum += a[j];
	        }
	      }
	     return sum;
	    }

	    public static void main(String[] args)
	     {
	    }
	}