class Solution {
    public int maxProduct(int n) {
        int org = n;
        org /= 10;
        int maxProd = 0;
        int temp = n;
        while(org != 0){
        int d = temp % 10;
        temp /= 10;
        while(temp != 0){
            int t = temp % 10;
            int prod = t * d;
            if(prod > maxProd){
                maxProd = prod;
            }
            temp /= 10;
        }
        temp = org;
        org /= 10;
        }
        return maxProd;
    }
}