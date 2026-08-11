class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.get(difference) != null)
                return new int[] {map.get(difference), i};
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}

// first thought answer: sort array, have two integers initially pointing to start and end, decrementing end if sum is too large and incrementing start if sum is too low