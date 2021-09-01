/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class lolwa_gamer
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int q=s.nextInt();
		int k=s.nextInt();
	    int[] arr= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		for(int i=0;i<q;i++)
		{
		    int l=s.nextInt();
		    int r=s.nextInt();
		    System.out.println(k-2*(r-l) +arr[r-1]-arr[l-1]-1 );
		}
		
		
		
	}
}
