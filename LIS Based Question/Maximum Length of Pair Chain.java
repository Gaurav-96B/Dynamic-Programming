class Solution {
   public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b) -> (a[0]-b[0]));
        int lis[] = new int[pairs.length];
        Arrays.fill(lis, 1);
        return lis(pairs,lis);    
    }
    
    public int lis(int[][] pairs,int lis[])
    {
        for (int i=1; i<pairs.length; i++) {
            for (int j=i-1; j>=0; j--) {
                if(pairs[i][0]>pairs[j][1])
                    lis[i] = Math.max(lis[i],lis[j]+1);
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<lis.length;i++)
        {
            max=Math.max(max,lis[i]);
        }
        return max; 
    }
}
