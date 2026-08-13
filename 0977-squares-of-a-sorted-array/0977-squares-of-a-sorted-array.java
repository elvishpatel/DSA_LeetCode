class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int index = nums.length -1;
        int  j = nums.length-1; 
        int small = 0;
        for(int i = 0; i < nums.length; i++){
            int sq = (int) Math.pow(nums[small], 2);
            int sq2 = (int) Math.pow(nums[j], 2);
            if(small == j){
                arr[index] = sq2;
            }
            if(sq2 > sq){
                arr[index--] = sq2;
                j--;
            }else{
                arr[index--] = sq;
                small++;
            }      

        }
        return arr;
    }
}