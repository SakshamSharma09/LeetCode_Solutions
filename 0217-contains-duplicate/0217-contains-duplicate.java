class Solution {
    public boolean containsDuplicate(int[] nums) {

        if(nums.length==1){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                return true;
            }

        }

        return false;
    }
}