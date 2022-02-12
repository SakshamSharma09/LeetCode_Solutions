class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] nums = reverse(image);
        
        return invert(nums);
    }
    
    public int[][] reverse(int[][] image){
        for(int i=0;i<image.length;i++){
            int j=0;
            while(j!=(image[i].length)/2){
                int num = image[i][j];
                image[i][j] = image[i][image[i].length-j-1];
                image[i][image[i].length-j-1] = num;
                j++;
            }
        }
        return image;
    }
    
    public int[][] invert(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] ^= 1;
            }
        }
        return nums;
    }
}