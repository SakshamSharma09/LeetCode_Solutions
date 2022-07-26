class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] combArr = new int[m+n];

        int s1=0;
        int s2=0;
        int start=0;

        while(s1!=m && s2!=n){
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

        while(s1!=m){
            combArr[start] = nums1[s1];
            start++;
            s1++;
        }

        while(s2!=n){
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