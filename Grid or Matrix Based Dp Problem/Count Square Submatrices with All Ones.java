class Solution {
    public int countSquares(int[][] matrix) {
        int dp[][]=new int[matrix.length+1][matrix[0].length+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        int ans=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==1)
                {
                    ans=ans+rectangle(matrix,i,j,dp);
                }
            }
        }  
        return ans;
    }
    public int rectangle(int matrix[][],int i,int j,int dp[][])
    {
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length||matrix[i][j]==0)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int ans=0;
        int right=rectangle(matrix,i,j+1,dp);
        int down=rectangle(matrix,i+1,j,dp);
        int diagonal=rectangle(matrix,i+1,j+1,dp);
        return dp[i][j]=1+Math.min(right,Math.min(down,diagonal));
    }
}
