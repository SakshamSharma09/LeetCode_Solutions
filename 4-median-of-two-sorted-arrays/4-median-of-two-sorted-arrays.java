class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combArr = new int[nums1.length+nums2.length];

        int s1=0;
        int s2=0;
        int start=0;

        while(s1!=nums1.length && s2!=nums2.length){
            if(nums1[s1]<=nums2[s2]){
                combArr[start] = nums1[s1];
                s1++;
            }
            else{
                combArr[start] = nums2[s2];
                s2++;
            }
            start++;
        }

        while(s1!=nums1.length){
            combArr[start] = nums1[s1];
            start++;
            s1++;
        }

        while(s2!=nums2.length){
            combArr[start] = nums2[s2];
            start++;
            s2++;
        }

        if(combArr.length%2==0){
            return (combArr[(combArr.length/2)-1] + combArr[combArr.length/2])/2.0;
        }
        return combArr[combArr.length/2];
    }
}