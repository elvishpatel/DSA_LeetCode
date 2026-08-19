class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i1 = 0,i2 = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    i1 = i;
                    i2 = j;
                }
            }
        }
        return new int[] { i1, i2 };
    }
}