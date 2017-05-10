package com.edhesive.lesson33;

public class Lesson_33_Activity_Five {

    public static void main(String[] args)
     {
       int[] nums = {1, 2, 3, 4, 5};
       int numTwo = 2;
       int numOne = 100;
       insertValue(nums, numOne, numTwo);
       for(int j = 0; j < nums.length; j++){
         System.out.print(nums[j]);
       }
    }

    public static void insertValue(int[] nums, int numOne, int numTwo){
      for(int j = nums.length - 1; j > numTwo; j--){
        nums[j] = nums[j] - 1;
      }
      nums[numTwo] = numOne;
    }
}