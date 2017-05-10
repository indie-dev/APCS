package com.edhesive.lesson33;

public class Lesson_33_Activity_Two {
	public static void main(String[] main){
		int[] nums = {0};
		randomize(nums);
	}

	public static void randomize(int[] nums) {
		// TODO Auto-generated method stub
		for(int i = 0; i < nums.length; i++){
			nums[i] = ((int)(Math.random() * 90)+10);
			System.out.println(nums[i]+ " ");
		}
	}
}
