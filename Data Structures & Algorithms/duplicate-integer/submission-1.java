class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Solution 2
        Set<Integer> arr = new HashSet<>();

        for(int i = 0; i < nums.length ; i++){
            if(arr.contains(nums[i]))
                return true;
            
            arr.add(nums[i]);
        }

        return false;
    }
}