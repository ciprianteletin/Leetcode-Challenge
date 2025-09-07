class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n == 1) {
            arr[0] = 0;
        } else if (n % 2 == 0) {
            int counter = 1;
            for (int i = 0; i < n; i = i + 2) {
                arr[i] = counter;
                arr[i + 1] = counter * -1;
                ++counter;
            }
        } else {
            arr[0] = 0;
            int counter = 1;
            for (int i = 1; i < n; i = i + 2) {
                arr[i] = counter;
                arr[i + 1] = counter * -1;
                ++counter;
            }
        }

        return arr;
    }
}