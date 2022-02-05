public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count =0;
        while(n!=0){
            n = (n - (n&(-n)));
            count++;
        }
        return count;
    }
}