class GFG {
	public static void main (String[] args) {
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        int table[]=new int[n];
	        table[0]=a[0];
	        for(int i=1;i<n;i++)
	        {
	            table[i]=a[i];
	            for(int j=i-1;j>=0;j--)
	            {
	               if(a[i]>a[j]) 
	               {
	                   int maxSum=table[j]+a[i];
	                   if(maxSum>table[i])
	                   {
	                       table[i]=maxSum;
	                   }
	               }
	            }
	        }
	        int max=0;
	        for(int i=0;i<n;i++)
	        {
	            if(table[i]>max)
	            {
	               max=table[i]; 
	            }
	        }
	        System.out.println(max);
	    }
	    
	}
}
