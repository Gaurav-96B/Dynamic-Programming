import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int table[][]=new int[1001][1001];
	public static void main (String[] args) {
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        String s=sc.next();
	        String s1=sc.next();
	        for(int i=0;i<=n;i++)
	        {
	            for(int j=0;j<=m;j++)
	            {
	                table[i][j]=-1;
	            }
	        }
	        int z=editDistance(s,s1,n,m);
	        int deletion=n-z;
	        int insertion=m-z;
	        int total=deletion+insertion;
	        System.out.println(total);
	        
	    }
	    
	}
	static int editDistance(String s,String s1,int n,int m)
	{
	   if(m==0||n==0)
	   {
	       return 0;
	   }
	   if(table[n][m]>-1)
	   {
	       return table[n][m];
	   }
	   else if(s.charAt(n-1)==s1.charAt(m-1))
	   {
	       return table[n][m]=1+editDistance(s,s1,n-1,m-1);
	   }
	   else
	   {
	       return table[n][m]=Math.max(editDistance(s,s1,n,m-1),editDistance(s,s1,n-1,m));
	   }
	}
}
