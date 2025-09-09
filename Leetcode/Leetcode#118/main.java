class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();

        List<Integer> current = new ArrayList<>();
        current.add(1);
        results.add(current);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = current;
            current = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                current.add(getElementOrOne(prev, j));
            }
            results.add(current);
        }
        return results;
    }

    int getElementOrOne(List<Integer> arr, int index) {
        int left = index - 1, right = index;
        if (left >= 0 && right < arr.size()) {
            return arr.get(left) + arr.get(right);
        }
        return 1;
    }
}