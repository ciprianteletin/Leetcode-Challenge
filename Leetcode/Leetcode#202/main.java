class Solution {
    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        while (n != 1) {
            int digits = n;
            int sum = 0;
            while (digits != 0) {
                int digit = digits % 10;
                sum += digit * digit;
                digits /= 10;
            }
            n = sum;
            if (numbers.contains(n)) {
                return false;
            }
            numbers.add(n);
        }

        return true;
    }
}