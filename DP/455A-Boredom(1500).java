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
		long[] dp= new long[100002];
		long[] dp2= new long[100002];
		for(int i=1;i<n+1;i++)
		{
		    int m=s.nextInt();
		    dp[m]+=(long)m;
		    if(dp[m]<0)
		     System.out.println(-1);
		}
		dp2[0]=0;
		dp2[1]=dp[1];
			for(int i=2;i<100002;i++)
		{
		    dp2[i]=Math.max((long)dp2[i-2]+dp[i],(long)dp2[i-1]);
		}
		System.out.println(dp2[100001]);
	
		
		
		
		
	}
}
