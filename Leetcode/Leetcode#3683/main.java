class Solution {
    public int earliestTime(int[][] tasks) {
        int min = 999;
        int sum = 0;
        for (int i = 0; i < tasks.length; i++) {
            sum = tasks[i][0] + tasks[i][1];
            if (min > sum) {
                min = sum;
            }
        }
        return min;
    }
}