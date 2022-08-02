class Solution {
    public boolean isSubsequence(String s, String t) {
        int subTrav = 0;
        for(int i=0;i<t.length();i++){
            if(subTrav==s.length()){
                return true;
            }
            if(s.charAt(subTrav)==t.charAt(i)){
                subTrav++;
            }
        }
        if(subTrav==s.length()){
            return true;
        }
        return false;
    }
}