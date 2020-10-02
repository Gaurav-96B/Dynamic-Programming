import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int table[][]=new int[1001][1001];
    static int lps(String s,int n,int m)
    {
        if(n>m)
        {
            return 0;
        }
        if(n==m)
        {
            return 1;
        }
        if(table[n][m]!=-1)
        {
            return table[n][m];
        }
        else if(s.charAt(n)==s.charAt(m))
        {
            return table[n][m]=2+lps(s,n+1,m-1);
        }
        else
        {
            return table[n][m]=Math.max(lps(s,n+1,m),lps(s,n,m-1));
        }
    }
	public static void main (String[] args) {
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        String s=sc.nextLine();
	        int n=s.length();
	        for(int i=0;i<=n;i++)
	        {
	            for(int j=0;j<=n;j++)
	            {
	                table[i][j]=-1;
	            }
	        }
	        System.out.println(lps(s,0,n-1));
	    }
}
}
