class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b)->a[0]-b[0]);
        int lis[] = new int [envelopes.length];
        Arrays.fill(lis, 1);
        return lis(envelopes,lis);
    }
    public int lis(int[][] envelopes,int lis[])
    {
       for (int i=1; i<envelopes.length; i++) {
            for (int j=i-1; j>=0; j--) {
                if(envelopes[i][0]!=envelopes[j][0]&&envelopes[i][1]>envelopes[j][1])
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
