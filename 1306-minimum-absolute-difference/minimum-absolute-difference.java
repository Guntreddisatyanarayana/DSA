class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr)
     {
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        
        int mini=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            int d=Math.abs(arr[i]-arr[i-1]);
            if(mini>=d)
            {
                List<Integer> l1=new ArrayList<>();
                l1.add(arr[i-1]);
                l1.add(arr[i]);
                if(mini==d)
                {
                   res.add(l1); 
                }
                else
                {
                    res.removeAll(res);
                    res.add(l1);
                }
                
                mini=d;
            }

        }
        return res;
        
    }
}