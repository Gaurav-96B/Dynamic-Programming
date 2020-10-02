class GfG
{
    int table[][]=new int[101][101];
    int lps(String str,int n,int m,int k)
    {
        if(n>m)
        {
            return 0;
        }
        if(m==n)
        {
            return 1;
        }
        if(table[n][m]!=-1)
        {
            return table[n][m];
        }
        if(str.charAt(n)==str.charAt(m))
        {
            return table[n][m]= 2+lps(str,n+1,m-1,k);
        }
        else
        {
            return table[n][m]=Math.max(lps(str,n+1,m,k),lps(str,n,m-1,k));
        }
    }
    boolean is_k_palin(String str, int k)
    {
        for(int i=0;i<=str.length();i++)
        {
            for(int j=0;j<=str.length();j++)
            {
                table[i][j]=-1;
            }
        }
        int z=lps(str,0,str.length()-1,k);
        int min=str.length()-z;
	      if(k>=min)
	      {
	          return true;
	      }
	      else
	      {
	          return false;
	      }
	    }   
    
}
