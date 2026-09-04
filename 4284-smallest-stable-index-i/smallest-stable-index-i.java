class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        int s=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
             if(max<=nums[i])
             {
                max=nums[i];
             }
            int val=max-findmin(i,nums.length,nums);
            if(val<=k)
            {
                s=Math.min(i,s);
            }
            
        }
        if(s<nums.length)
        {
            return s;
        }
        else
        {
            return -1;
        }
    }
    static int findmin(int s,int n,int[] nums)
    {
        int m=Integer.MAX_VALUE;
        for(int i=s;i<n;i++)
        {
           m= Math.min(m,nums[i]);
        }
        return m;
    }
}