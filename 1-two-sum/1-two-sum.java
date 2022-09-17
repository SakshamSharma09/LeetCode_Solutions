class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int last = nums.length-1;
            int num = target - nums[i];
            while(i!=last){
                if(num==nums[last]){
                    return new int[]{i,last};
                }
                last--;
            }
        }
        return new int[]{0,0};
    }
}