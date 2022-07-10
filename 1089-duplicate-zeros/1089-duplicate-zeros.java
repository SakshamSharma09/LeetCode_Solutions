class Solution {
    public void duplicateZeros(int[] arr) {
        int[] dupzeroes = arr.clone();
        int j=0;
        for(int i=0;i<arr.length && j<arr.length;i++){
            if(dupzeroes[i]==0){
                arr[j] = 0;
                
                j++;
                if(j==arr.length){
                    break;
                }
                arr[j] = 0;   
            }
            else{
                arr[j] = dupzeroes[i];
            }
            j++;
        }
        
    }
}