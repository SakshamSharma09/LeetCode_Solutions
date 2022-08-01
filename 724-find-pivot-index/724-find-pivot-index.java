class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftRunningSum = new int[nums.length];
        int[] rightRunningSum =  new int[nums.length];
        leftRunningSum[0] = nums[0];
        rightRunningSum[nums.length-1] = nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            rightRunningSum[j] += rightRunningSum[j+1] + nums[j];
        }
        for(int i=1;i<nums.length;i++){
            leftRunningSum[i] += leftRunningSum[i-1] + nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(leftRunningSum[i] == rightRunningSum[i]){
                return i;
            }
        }
        return -1;
    }
}