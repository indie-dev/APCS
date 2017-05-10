package com.extra;

import java.io.InputStream;
import java.util.Scanner;

public class Scan{
	private InputStream in;
	private static Scanner s;
	public Scan(InputStream in){
		this.in = in;
		s = new Scanner(in);
	}
	
	public static boolean getBool = s.nextBoolean();
	public static int getInt = s.nextInt();
}
