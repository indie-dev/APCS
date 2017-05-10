package T2.com.edhesive.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson_1_Activity {
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
        }
        else{
          list.add(tempStr);
        }
      }
      System.out.println();
      System.out.println(list.size());
      System.out.println(list);
      list.remove(0);
      //list.remove(list.size()-1);
      System.out.println(list);
  }
}
