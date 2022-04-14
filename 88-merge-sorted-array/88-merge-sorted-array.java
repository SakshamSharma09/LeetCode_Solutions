class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(m==0){
            
            for(int i=0;i<m+n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        if(m!=0 && n!=0){
            
            int[] temp = new int[m];
            
            for(int i=0;i<m;i++){
                temp[i] = nums1[i];
            }
            
            int i=0,j=0,k=0;
            while(i!=m && j!=n){
                
                if(temp[i]>nums2[j]){
                    nums1[k] = nums2[j];
                    j++;
                }
                else{
                    nums1[k] = temp[i];
                    i++;
                }
                k++; 
                
            } 
            while(j!=n){
                nums1[k] = nums2[j];
                j++;k++;
            }
            while(i!=m){
                nums1[k] = temp[i];
                i++;k++;
            }
        }
    }
}