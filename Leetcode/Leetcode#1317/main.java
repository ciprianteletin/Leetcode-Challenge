class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] sol = new int[2];
        int a = 1;
        int b = n - 1;
        while (hasAnyZero(a) || hasAnyZero(b)) {
            ++a;
            --b;
        }
        sol[0] = a; sol[1] = b;
        return sol;
    }

    private boolean hasAnyZero(int n) {
        while (n != 0) {
            if (n % 10 == 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}