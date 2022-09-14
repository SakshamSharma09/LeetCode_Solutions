class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> map = new HashSet<Integer>();
        int newNo = square(n);
        do{
            if(newNo==1){
                return true;
            }
            map.add(newNo);
            newNo = square(newNo);
        } while(!map.contains(newNo));
        return false;
    }
    
    public int square(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans += rem*rem;
            n = n/10;
        }
        return ans;
    }
}