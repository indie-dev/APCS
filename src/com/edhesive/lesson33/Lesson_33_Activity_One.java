package com.edhesive.lesson33;

public class Lesson_33_Activity_One {
	public static void main(String[] args){
	    String[] array = {"Hello", "My name is what?", "My name is who?", "My name is harambe."};
	    upper(array);
	}
	public static void upper(String[] array) {
		// TODO Auto-generated method stub
		for(int i = 0; i < array.length; i++){
			array[i] = array[i].toUpperCase();
		}
	}
}
