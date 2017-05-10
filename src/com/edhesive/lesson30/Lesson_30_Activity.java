package com.edhesive.lesson30;

public class Lesson_30_Activity {
    public static String[] list = {"every","near ing"," checking","food ","stand","value "};
	public static void main(String[] params){
		for(int i = 0; i < list.length; i++){
			list[i] = list[i].replace(" ", "");
		}
		
	}
}
