class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list= new ArrayList<String>();  
        for(int i=1;i<=n;i++){
            if(i%3!=0 && i%5!=0){
                list.add(i+"");
            }
            else if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }
            else if(i%3==0 && i%5!=0){
                list.add("Fizz");
            }
            else {
                list.add("Buzz");
            }
        }
        return list;
    }
}