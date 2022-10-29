class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        if(digits[size-1]!=9){
            digits[size-1]++;
            return digits;
        }
        else{
            while(size!=0 && digits[size-1]==9){
                digits[size-1] = 0;
                size--;
            }
            if(size!=0){
                digits[size-1]++;
            }
            else{
                int[] ans = new int[digits.length+1];
                ans[0] = 1;
                return ans;
            }
            
        }
        return digits;
    }
}