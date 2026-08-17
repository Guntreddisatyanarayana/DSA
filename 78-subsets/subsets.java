class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        find(nums, 0, new ArrayList<>(), result);
        return result;
    }

    static void find(int[] nums, int i, List<Integer> list,
                     List<List<Integer>> result) {

        if (i == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        // Take
        list.add(nums[i]);
        find(nums, i + 1, list, result);

        // Don't take
        list.remove(list.size() - 1);
        find(nums, i + 1, list, result);
    }
}