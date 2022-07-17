class Solution {
    public void moveZeroes(int[] nums) {
        int writeptr = 0;
        
        for(int read = 0 ;read<nums.length ;read++){
            if(nums[read]!=0){
                nums[writeptr] = nums[read];
                writeptr++;
            }
        }
        
        while(writeptr!=nums.length){
            nums[writeptr] = 0;
            writeptr++;
        }
    }
}