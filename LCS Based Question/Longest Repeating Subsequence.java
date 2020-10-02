import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int table[][]=new int[1001][1001];
    static int lrs(String s,String s1,int n,int m)
    {
        if(n==0||m==0)
        {
            return 0;
        }
        if(table[n][m]!=-1)
        {
            return table[n][m];
        }
        else if(s.charAt(n-1)==s1.charAt(m-1)&&n!=m)
        {
            return table[n][m]=1+lrs(s,s1,n-1,m-1);
        }
        else
        {
            return table[n][m]=Math.max(lrs(s,s1,n-1,m),lrs(s,s1,n,m-1));
        }
    }
	public static void main (String[] args) {
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        sc.nextLine();
	        String s=sc.nextLine();
	        for(int i=0;i<=n;i++)
	        {
	            for(int j=0;j<=n;j++)
	            {
	                table[i][j]=-1;
	            }
	        }
	        System.out.println(lrs(s,s,n,n));
	        
	    }
	    
	}
}
