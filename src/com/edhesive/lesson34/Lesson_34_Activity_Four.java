package com.edhesive.lesson34;

public 
class Lesson_34_Activity_Four {

	   public static int findMin(int [] a)
	    {
	      int smallest = a[0];
	      for(int j = 0; j < a.length; j++){
	        if(a[j] < smallest){
	          smallest = a[j];
	        }
	      }
	     return smallest;
	    }

	    public static void main(String[] args)
	     {
	    }
	}