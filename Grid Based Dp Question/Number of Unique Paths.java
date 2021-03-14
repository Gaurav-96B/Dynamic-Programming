static int table[][]=new int [17][17];
static int NumberOfPathCount(int i,int j,int n,int m) 
{
    if(i==n&&j==m)
    {
        return 1;
    }
    if(i>n||j>m)
    {
        return 0;
    }
    if(table[i][j]!=-1)
	    {
	        return table[i][j];
	    }
return table[i][j]=NumberOfPathCount(i+1,j,n,m)+NumberOfPathCount(i,j+1,n,m);
}
public static int NumberOfPath(int a, int b) {
    
     for(int i=0;i<=a;i++)
	       {
	           for(int j=0;j<=b;j++)
	           {
	               table[i][j]=-1;
	           }
	       }
    
    return NumberOfPathCount(0,0,a-1,b-1);
}
