class Solution {
    public int removeDuplicates(int[] nums) {
        int writeptr = 1;
        
        for(int readptr = 1; readptr<nums.length;readptr++){
            if(nums[readptr] != nums[readptr-1]){
                nums[writeptr] = nums[readptr];
                writeptr++;
            }
        }
        return writeptr;
            
    }
}