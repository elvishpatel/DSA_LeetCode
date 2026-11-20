class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int maxAmount = 0;

        while(left < right){
            int temp = Math.min(height[left], height[right]) * (right-left);

            if(temp > maxAmount){
                maxAmount = temp;
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        } 

        return maxAmount;   
    }
}