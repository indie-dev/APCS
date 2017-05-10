package com.edhesive.lesson24;

public class Lesson_24_Activity_One {
	public static void main(String[] args){
		for(int i = 23; i <= 89; i++){
			System.out.append(i + " ");
			if(0 == (i - 23 + 1) % 10 ){
				System.out.println("");
			}
		}
	}
}
