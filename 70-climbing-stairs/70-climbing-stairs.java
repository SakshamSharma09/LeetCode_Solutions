class Solution {
    public int climbStairs(int n) {
        int[] previousClimb = new int[n+1];
        return totalWays(n,previousClimb);
    }
    
    public int totalWays(int n, int[] previousClimb){
        if(n==1 || n==2 || n==3){
            return n;
        }
        
        if(previousClimb[n]!=0){
            return previousClimb[n];
        }
        
        previousClimb[n] = totalWays(n-1,previousClimb) + totalWays(n-2,previousClimb);
        return previousClimb[n];
    }
}