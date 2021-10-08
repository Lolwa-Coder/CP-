import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 public class lolwa_gamer
{
   
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		for(int w=0;w<t;w++){
		    int n=s.nextInt();
		    String c=s.next();
		    String str=s.next();
		    int diff=0;
		    ArrayList<Integer> list= new ArrayList<>();
		    for(int i=0;i<str.length();i++)
		    {
		        if(!str.substring(i,i+1).equals(c))
		         {diff++;
		          list.add(i+1);
		         }
		         
		    }
		    if(diff==0)
		     System.out.println("0");
		    
		    else
		     {
		         int falg=0;
		         
		         for(int i=n/2 +1;i<n+1;i++)
		         {
		             if(str.substring(i-1,i).equals(c))
		             {
		                 System.out.println("1");
		                 System.out.println(i);
		                 falg=1;
		                 break;
		             }
		         }
		         
		         if(falg==0)
		         {
		             System.out.println(2);
		             System.out.println(n+" "+(n-1));
		         }
		         
		     }
		    
		}
		
		
	}
}
