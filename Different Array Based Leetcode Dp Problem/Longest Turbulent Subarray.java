
class Solution {
  public int maxTurbulenceSize(int A[]) {
        if(A.length==0) 
        {
            return 0;
        }
        int max = 1;
        int curmax=1;
        boolean now = true;
        for(int i=1;i<A.length;i++)
        {
            if(i%2==0)
            {
                if(A[i]<A[i-1])
                {
                    if(now)
                    {
                     curmax=curmax+1;  
                    }
                    else
                    {
                    curmax=2;
                    }
                    now=true;
                    max = Math.max(curmax,max);
                }
                else if(A[i]>A[i-1])
                {
                    if(!now)
                    {
                     curmax=curmax+1;  
                    }
                    else
                    {
                    curmax=2;
                    }
                    now=false;
                    max = Math.max(curmax,max);
                } 
                else 
                {
                    curmax=1;
                    continue;
                }
            }
            else 
            {
                if(A[i]>A[i-1])
                {
                    if(now)
                    {
                     curmax=curmax+1;  
                    }
                    else
                    {
                    curmax=2;
                    }
                    now=true;
                    max = Math.max(curmax,max);
                }
                else if(A[i]<A[i-1])
                {
                    if(!now)
                    {
                     curmax=curmax+1;  
                    }
                    else
                    {
                    curmax=2;
                    }
                    now=false;
                    max = Math.max(curmax,max); 
                } 
                else {
                    curmax=1;
                    continue;
                }
            }
        }
        return max;
    }
}  
