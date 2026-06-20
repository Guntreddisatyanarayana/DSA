class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        List<Integer> L1=new ArrayList<>();
        HashSet<Integer> s1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!s1.contains(nums[i]) && nums[i]>0){
                s1.add(nums[i]);
                L1.add(nums[i]);
            }

        }
        if(L1.size()==0){
            return 1;
        }
        Integer[] arr = L1.toArray(new Integer[0]);
          if(arr[0]>0 && arr[0]!=1){
            return 1;
        }
                
    
        
       int i;
        for( i=1;i<arr.length;i++){
             if(arr[i]!=arr[i-1]+1){
                return arr[i-1]+1;

             }
        }
        return  arr[i-1]+1;
    }
    
}