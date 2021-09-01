/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class lolwa_gamer
{
    static int getSum(int n)
    {
        int sum;
  
        
        for (sum = 0; n > 0; sum += n % 10,
                                  n /= 10);
  
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int[] dp= new int[10001];
		dp[0]=19;
		int val=0;
		for(int i=1;i<n+1;i++)
		{
		    
		    dp[i]=9+dp[i-1];
		    while(getSum(dp[i])!=10)
		    {
		        dp[i]+=9;
		        
		    }
		   
		}
		System.out.println(dp[n-1]);
		
		
		
	}
}
