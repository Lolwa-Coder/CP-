public class lolwa_gamer
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		for(int w=0;w<t;w++){
		    String str=s.next();
		    char[] ch = str.toCharArray();
		    int s1=0;
		    int s0=0;
		    int p0=0;
		    int p1=0;
		    for(int i=0;i<str.length();i++)
		    {
		        if(ch[i]=='1')
		        {
		            s1++;
		        }
		        else 
		        
		            s0++;
		    }
		    int ans=Math.min(s1,s0);
		    for(int i=0;i<str.length();i++)
		    {
		        if(ch[i]=='1')
		        {
		            p1++;
		            s1--;
		        }
		        else{
		            p0++;
		            s0--;
		        }
		        ans=Math.min(p1+s0,ans);
		        ans=Math.min(s1+p0,ans);
		        
		    }
		    System.out.println(ans);
		    
		    
		}
		
		
	}
}
