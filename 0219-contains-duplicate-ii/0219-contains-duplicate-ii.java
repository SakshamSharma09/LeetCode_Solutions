class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
       for(int i=0;i<nums.length;i++){
           if(!set.contains(nums[i])){
               set.add(nums[i]);
           }
           else{
               for(int j=0;j<i;j++){
                   if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                       return true;
                   }
               }
           }
       }
        return false;
    }
}