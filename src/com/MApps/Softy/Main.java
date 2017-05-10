package com.MApps.Softy;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		int grid [][] = new int [3][5];
		int c = 0;
		for (int i =0; i < grid.length; i++) {
		    for (int j = 0; j < grid[i].length; j++) {
		        grid[i][j] = c;
		        c++;
		    }
		}
		
		System.out.print("\n"+grid[2][1]);
	}

}