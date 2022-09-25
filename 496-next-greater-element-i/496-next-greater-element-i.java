class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i] = findGreater(nums1[i],nums2);
        }
        return ans;
    }
    
    public int findGreater(int toFind, int[] arr){
        int ptr;
        for(ptr=0;ptr<arr.length;ptr++){
            if(arr[ptr] == toFind){
                break;
            }
        }
        while(ptr!=arr.length){
            if(arr[ptr]>toFind){
                return arr[ptr];
            }
            ptr++;
        }
        return -1;
    }
}