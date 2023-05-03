class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];  //sum will be increase to the previous sum + curr element
            if(sum>max){     // if found greater element then replace it to max
                max = sum;
            }
            if(sum < 0){ //  the negative value of sum will never contribute to max value so 
                sum=0;   //  if negative value occurs occurs dont use it for the upcoming sum.
            }          
        }
        return max;
    }
}