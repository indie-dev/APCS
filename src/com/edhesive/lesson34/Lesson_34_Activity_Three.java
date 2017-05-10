package com.edhesive.lesson34;

public class Lesson_34_Activity_Three {

	   public static int findMax(int [] a)
	    {
	      int max = a[0];
	      for(int j = 0; j < a.length; j++){
	        if(a[j] > max){
	          max = a[j];
	        }
	      }
	     return max;
	    }

	    public static void main(String[] args)
	     {
	    }
	}