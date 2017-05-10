package com.edhesive.assignments;

import java.io.IOException;
import java.util.Scanner;

public class Assignment4 {
	 public static void main (String str[]) throws IOException
	    {
	      
	        Scanner scan = new Scanner(System.in);
	        String tweet = scan.nextLine();
	         
	        //Counting Tweet Length
	        int tweetlength = tweet.length();
	        if (tweetlength > 140)
	        {
	           String overchars = tweet.substring(140);
	           int overlength = overchars.length();
	           System.out.println("Excess Characters: " + overlength);           
	        }
	        else
	        {
	            System.out.println("Length Correct");
	           
	           
	            //hashtag count
	            int hashtagCount = 0;
	            int intervalLength = 0;

	            for (int i = 0; i < tweetlength; ++i)
	            {
	                if (tweet.charAt(i) == '#')
	                {
	                    intervalLength++;
	                    if (intervalLength == 0)
	                    {
	                        ++hashtagCount;
	                    }
	                }
	                else
	                if (tweet.charAt(i) == ' ')
	                {
	                    intervalLength = 0;
	                }
	                else
	                {
	                    ++intervalLength;
	                }
	            }
	            
	            System.out.println("Number of Hashtags: " + hashtagCount);
	            //mention count
	            int mentionCount = 0;
	            for (int i = 0; i < tweetlength-1; ++i)
	            {
	                if (tweet.charAt(i) == '@' && tweet.charAt(i + 1) != ' ' && tweet.charAt(i + 1) != '\t')
	                {
	                    mentionCount++;
	                } 
	            }
	            System.out.println("Number of Attributions: " + mentionCount);
	           
	            //link count
	            int linkCount = 0;
	          
	            String tweetLower = tweet.toLowerCase();
	            for (int i = 4; i < tweetlength-8; ++i)
	            {
	                if (tweetLower.substring(i,i+7) == "http://" || tweetLower.substring(i,i+8) == "http://" || tweetLower.substring(i,i+6) == "http://")
	                {
	                    linkCount++;
	                } 
	            }

	            System.out.println("Number of Links: " + linkCount);
	        }
	    }
}
