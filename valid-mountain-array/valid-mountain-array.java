class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int high=-1;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                high=i;
            }
        }
        if(high==-1){
            return false;
        }
        for(int i=0;i<high;i++){
            if(arr[i] >= arr[i+1]){
                return false;
            }
        }
        for(int j=high;j<arr.length-1;j++){
            if(arr[j] <= arr[j+1]){
                return false;
            }
        }
        return true;
    }
}