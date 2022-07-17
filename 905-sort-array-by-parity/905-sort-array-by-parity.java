class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int write=0;
        
        for(int read=0;read<nums.length;read++){
            if(nums[read]%2==0){
                int temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;
                write++;
            }
        }
        return nums;
    }
}