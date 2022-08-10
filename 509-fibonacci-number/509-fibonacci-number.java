class Solution {
    public int fib(int n) {
        double sqrt5 = Math.sqrt(5);
        //double ans = ((Math.pow((1+sqrt5)/2,n) - Math.pow((1-sqrt5)/2,n))/sqrt5);
        return (int)((Math.pow((1+sqrt5)/2,n) - Math.pow((1-sqrt5)/2,n))/sqrt5);
    }
}