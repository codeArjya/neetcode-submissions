class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ret = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums)
            map.put(n, map.getOrDefault(n, 0) + 1);
        for(int i = 0; i < k; i++)
        {
            int max = nums[0];
            for(int num: map.keySet()) {
                if(map.get(num) > map.getOrDefault(max, 0))
                    max = num;
            }
            map.remove(max);
            ret[i] = max;
        }
        return ret;
    }
}
