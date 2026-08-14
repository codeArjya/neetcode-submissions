class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet();
        for(int num: nums)
            numSet.add(num);
        int longest = 0;
        for(int num: numSet) {
            if(!numSet.contains(num - 1)) {
                int length = 1;
                while(numSet.contains(num + length))
                    length++;
                if(length > longest)
                    longest = length;
            }
        }
        return longest;
    }
}

// sort and then check if greater than 1 of prev element; count of curr length and max; solution is O(nlogn) not O(n)