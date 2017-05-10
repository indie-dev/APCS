package com.edhesive.lesson20;

import java.util.Scanner;

public class Lesson_20_Activity {
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    double farthestNorth = -90;
	    double farthestSouth = 90;
	    double farthestEast = -180;
	    double farthestWest = 180;
	    int flag = 1;
	    while (flag == 1) {
	      System.out.println("Please enter the latitude:");
	      double lat = scanner.nextDouble();
	      System.out.println("Please enter the longitude:");
	      double lon = scanner.nextDouble();
	      if (lat < -90 || lat > 90 || lon < -180 || lon > 180) {
	        System.out.println("Incorrect Latitude or Longitude");
	        continue;
	      }
	      if (lat > farthestNorth) {
	        farthestNorth = lat;
	      }
	      if (lat < farthestSouth) {
	        farthestSouth = lat;
	      }
	      if (lon > farthestEast) {
	        farthestEast = lon;
	      }
	      if(lon <farthestWest) {
	        farthestWest = lon;
	      }
	      System.out.println("Would you like to enter another location?");
	      flag = scanner.nextInt();
	    }
	    System.out.println("Farthest North: " + farthestNorth);
	    System.out.println("Farthest South: " + farthestSouth);
	    System.out.println("Farthest East: " + farthestEast);
	    System.out.println("Farthest West: " + farthestWest);
	  }
	}