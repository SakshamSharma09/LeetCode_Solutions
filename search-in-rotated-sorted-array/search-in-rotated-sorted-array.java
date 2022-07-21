class Solution {
    public int search(int[] nums, int target) {
        int left = 1;
        int right = nums.length-2;
        int targetIndex = -1;
        
        if(nums.length==1){
            return (nums[0]==target?0:-1);
        }
        
        
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>nums[mid-1] && nums[mid+1]<nums[mid]){
                left = mid+1;
                right = mid;
                break;
            }
            else if(nums[mid-1]>nums[mid] && nums[mid+1]>nums[mid]){
                left = mid;
                right = mid-1;
                break;
            }
            else{
                if(nums[left-1]>nums[mid]){
                    right = mid-1;
                }
                else if(nums[right+1]<nums[mid]){
                    left = mid+1;
                }
                else{
                    targetIndex=BinarySearch(nums,target,0,nums.length-1);
                    break;
                }
            }
        }
        
        if(targetIndex==-1){
            targetIndex=BinarySearch(nums,target,left,nums.length-1);
        }
        if(targetIndex==-1){
            targetIndex=BinarySearch(nums,target,0,right);
        }
        return targetIndex;
    }
    
    public int BinarySearch(int[] nums, int target, int left, int right) {
        while(left<=right){
            int mid = (right - left)/2 + left;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;  
    }
            
}