class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.min(nums[0],nums[1]);
        }
        int left = 1;
        int right = nums.length-2;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            else if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else{
                if(nums[mid]>nums[left-1]){
                    left = mid+1;
                }
                else if(nums[mid]<nums[right+1]){
                    right = mid-1;
                }
            }
        }
        return nums[0];
    }
}