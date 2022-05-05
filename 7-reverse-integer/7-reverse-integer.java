import java.lang.*;
class Solution {
    public int reverse(int x) {
        long sum=0;
        int i=x;
        
        while(i/10 != 0){
            
            sum = (sum + i%10)*10;
            System.out.println(sum);
            i = i/10;
            
            if(sum<(-1)*Math.pow(2,31)  || sum>Math.pow(2,31)-1){
                return 0;
            }
            
        }
        
        sum+=i%10;
        return (int)sum;
    }
}
