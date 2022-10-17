class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<String> seen = new HashSet<String>();
        for(int i=0;i<sentence.length();i++){
            if(!seen.contains(Character.toString(sentence.charAt(i)))){
                seen.add(Character.toString(sentence.charAt(i)));
            }
        }
        
        if(seen.size()==26){
            return true;
        }
        return false;
    }
}