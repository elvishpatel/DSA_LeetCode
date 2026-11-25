class Solution {
    public boolean canJump(int[] nums) {
        int ToBeReached = nums.length-1;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] >= ToBeReached - i){
                ToBeReached = i;
            }
        }
        if(ToBeReached == 0){
            return true;
        }else{
            return false;
        }
    }
}