package T2.com.edhesive.lesson2;

import java.util.ArrayList;
import java.util.Scanner;

import com.MApps.Softy.Main;

public class Lesson_2_Activity {
	public static void main(String[] args){
		  System.out.println("Please enter words, enter STOP to stop the loop.");
	      ArrayList<String> list = new ArrayList<String>();
	      Scanner scan = new Scanner(System.in);
	      String tempStr = "";
	      boolean input = true;

	      while(input){
	        	tempStr = scan.nextLine();
		        if(tempStr.equals("STOP")){
		          input = false;
		        }else{
		          list.add(tempStr);
		        }
	      }
	      
	      for(int i = 0; i < list.size(); i++){
	    	  if(list.get(i).contains("a")){
	    		  System.out.println(list.get(i));
	    	  }
	      }
	}
}
