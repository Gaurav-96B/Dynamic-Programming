class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int[] oddSum  = new int[nums.length];
        int[] evenSum = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            if(i%2 == 0)
            {
                if(i>0)
                {
                  evenSum[i]=evenSum[i-1] + nums[i];
                }
                else
                {
                   evenSum[i]=nums[i];
                }
                if(i>0)
                {
                  oddSum[i]=oddSum[i-1];
                }
                else
                {
                   oddSum[i]=0;
                }
                
            }
            else
            {
                
             if(i>0)
                {
                   oddSum[i]=oddSum[i-1] + nums[i];
                }
                else
                {
                   oddSum[i]=nums[i];
                }
                if(i>0)
                {
                  evenSum[i]=evenSum[i-1];
                }
                else
                {
                   evenSum[i]=oddSum[i-1] + nums[i];
                }   
            }
        }
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i == 0)
            {
                if(evenSum[n-1] - evenSum[0] == oddSum[n-1] - oddSum[0]) 
                {
                    ans++;
                }
            }
            else if(i == n-1)
            {
                if(oddSum[i-1] == evenSum[i-1]) 
                {
                    ans++;
                }
            }
            else
            {
                int even = evenSum[i-1] + oddSum[n-1] - oddSum[i];
                int odd = oddSum[i-1] + evenSum[n-1] - evenSum[i];
                if(even == odd) 
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}

