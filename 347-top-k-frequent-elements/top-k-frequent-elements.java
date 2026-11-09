class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
         List<Map.Entry<Integer,Integer>> l1=new ArrayList<>(map.entrySet());
               
        l1.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int[] res=new  int[k];
        int c=0;
   for(Map.Entry<Integer,Integer> entry:l1)
   { if(c<k)
      {
       res[c++]=entry.getKey();
      }
      else
      {
        break;
      }
   }
    return res;
    }
    
}