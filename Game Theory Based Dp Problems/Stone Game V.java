class Solution {
    public int stoneGameV(int[] stoneValue) {  
    int prefixSum[]=new int[stoneValue.length];
    prefixSum[0]=stoneValue[0];
    for(int i=1;i<stoneValue.length;i++)
    {
        prefixSum[i]=prefixSum[i-1]+stoneValue[i];
    } 
    int dp[][]=new int[stoneValue.length+1][stoneValue.length+1];
    for(int row[]:dp)
    {
    Arrays.fill(row,-1);
    }
    return maxScore(stoneValue,prefixSum,0,stoneValue.length-1,dp);   
    }
    
    public int maxScore(int a[],int prefixSum[],int i,int j,int dp[][])
    {
    if(i>=j)
        return 0;
    
    if(dp[i][j]!=-1)
        return dp[i][j];
    
	
    int ans=0; 
    for(int k=i;k<j;k++)
    {
        int op1=0;
        int op2=0;
        int temp=0;
        if(i==0)
        {
        op1=prefixSum[k];    
        }
        else
        {
          op1=prefixSum[k]-prefixSum[i-1];
        }
        op2= prefixSum[j]-prefixSum[k];
        
        if(op1<op2) 
        {
            temp=op1+maxScore(a,prefixSum,i,k,dp);
        }
        else if(op2<op1)
        {
            temp=op2+maxScore(a,prefixSum,k+1,j,dp);
        }
        else
        {
        temp=Math.max(op1+maxScore(a,prefixSum,i,k,dp),op2+maxScore(a,prefixSum,k+1,j,dp)); 
        }
        ans=Math.max(ans,temp);
    }
    
    return dp[i][j]=ans;    
}
    
}

