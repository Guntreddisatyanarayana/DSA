class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) 
    {
      int sum=0;
      int c=0;
      int l=0;
     int  maxAvg=Integer.MIN_VALUE;
      for(int i=0;i<k;i++)
      {
            sum+=arr[i];
      }
         float f=(float)sum/k;
         if(f>=threshold)
         {
             c++;
         }
      for(int r=k;r<arr.length;r++)
      {
          sum-=arr[l];
          sum+=arr[r];
             if((float)sum/k>=threshold)
             {
                c++;
             }
          l++;
          
      }
     
    return c;  
    }
}