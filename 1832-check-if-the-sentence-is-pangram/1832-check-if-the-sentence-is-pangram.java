class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int[] ans = new int[26];
        for(int i=0;i<sentence.length();i++){
            ans[(int)sentence.charAt(i)- 97]++;
        }
        
        for(int i=0;i<ans.length;i++){
            if(ans[i]==0){
                return false;
            }
        }
        return true;
    }
}