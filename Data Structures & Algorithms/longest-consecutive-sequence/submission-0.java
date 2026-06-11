class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int num=nums[i];
            while(set.contains(num++)){
                count++;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}
