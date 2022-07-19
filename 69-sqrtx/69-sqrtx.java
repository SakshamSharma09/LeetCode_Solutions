class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        long mid =0L;
        
        // if(x>2147483647){
        //     return x;
        // }
        while(left<=right){
            mid = (right-left)/2 + left;
            if(mid*mid== x){
                return (int)mid;
            }
            else if(mid*mid<x){
                left = (int)mid+1;
            }
            else{
                right = (int)mid-1;
            }
        }
        if(mid*mid>x){
            return (int)mid-1;
        }
        return (int)mid;
    }
}