class Solution
{
	public int minDeletions(int arr[], int n) 
	{ 
	    int lis[]=new int[n];
	    Arrays.fill(lis,1);
	    int maxLis=lis(arr,lis,n);
	    return n-maxLis;
	} 
	public int lis(int arr[],int lis[],int n)
	{
	   for(int i=1;i<arr.length;i++) 
	   {
	       for(int j=i-1;j>=0;j--)
	       {
	           if(arr[i]>arr[j])
	           {
	              lis[i]=Math.max(lis[i],lis[j]+1);
	           }
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
