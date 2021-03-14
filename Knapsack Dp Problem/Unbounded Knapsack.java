
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int table[][]=new int[1001][1001];
    static int knapsack(int n,int w,int v[],int w1[])
    {
        if(n==0||w==0)
        {
            return 0;
        }
        if(table[n][w]!=-1)
        {
            return table[n][w];
        }
        if(w1[n-1]<=w)
        {
            return table[n][w]=Math.max(v[n-1]+knapsack(n,w-w1[n-1],v,w1),knapsack(n-1,w,v,w1));
        }
        else
        {
            return table[n][w]=knapsack(n-1,w,v,w1);
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
	        int w=sc.nextInt();
	        int v[]=new int[n];
	        int w1[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            v[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	            w1[i]=sc.nextInt();
	        }
	        for(int i=0;i<=n;i++)
	        {
	            for(int j=0;j<=w;j++)
	            {
	                table[i][j]=-1;
	            }
	        }
	        System.out.println(knapsack(n,w,v,w1));
	        
	    }
	    
	    
	}
}
	    
