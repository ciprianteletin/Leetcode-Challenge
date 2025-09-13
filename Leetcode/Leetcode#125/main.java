class Solution {
    public boolean isPalindrome(String s) {
        String original = "", reverse = "";
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {
                original += c;
                reverse = c + reverse;
            }
        }
        return original.equalsIgnoreCase(reverse);
    }
}