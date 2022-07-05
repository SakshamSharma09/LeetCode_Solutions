class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] runsum = new int[nums.length];
        runsum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            runsum[i] = runsum[i-1] + nums[i];
        }
        return runsum;
    }
}