package com.edhesive.lesson34;

public class Lesson_34_Activity_Six {

	  public static boolean allPositive(int [] a)
	    {
	      boolean pos = true;
	      for(int j = 0; j < a.length; j++){
	        if(a[j] < 0){
	          pos = false;
	        }
	      }
	     return pos;
	    }

	    public static void main(String[] args)
	     {
	    }
	}