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
		long ans=0;
		int prev=0;
		for(int i=0;i<n;i++)
		{
		    int k=s.nextInt();
		    
		    ans+=Math.abs(k-prev);
		    prev=k;
		}
		System.out.println(ans);
		
		
		
	}
}
