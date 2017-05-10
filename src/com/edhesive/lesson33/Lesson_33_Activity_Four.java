package com.edhesive.lesson33;

import java.util.Arrays;

public class Lesson_33_Activity_Four {
    public static void main(String[] args)
    {
      int[] nums = {1, 2, 3};
      reverse(nums);
      for(int j = 0; j < nums.length; j++){
        System.out.print(nums[j]);
      }
   }

 public static void reverse(int[] nums){
   int temp;
   for(int j = 0; j < nums.length / 2; j++){
     temp = nums[j];
     nums[j] = nums[nums.length -j - 1];
     nums[nums.length - j - 1] = temp;
   }
 }
}