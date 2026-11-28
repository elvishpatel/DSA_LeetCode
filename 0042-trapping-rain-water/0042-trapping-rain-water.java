class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int lmax = 0, rmax = 0;
        int total = 0;
        while(l < r){
            if(height[l] <= height[r]){
                if(height[l] > lmax){
                    lmax = height[l];
                }
                else if(lmax - height[l] > 0){
                    total += lmax - height[l];
                }
                l++;
            }else{
                if(height[r] > rmax){
                    rmax = height[r];
                }
                else if(rmax - height[r] > 0){
                total += rmax - height[r];
                }
                r--;
            }
        }
        return total;
    }
}