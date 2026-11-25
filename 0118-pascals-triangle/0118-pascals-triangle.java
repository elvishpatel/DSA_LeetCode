class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
        List<Integer> cols = new ArrayList<>();

        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i) {
                cols.add(1);
            } else {
                List<Integer> prevRow = list.get(i - 2);
                int val = prevRow.get(j - 2) + prevRow.get(j - 1);
                cols.add(val);
            }
        }
        list.add(cols); 
    }

    return list;
    }
}