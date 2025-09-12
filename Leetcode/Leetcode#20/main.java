class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                bracket.add(c);
            } else {
                if (bracket.empty()) {
                    return false;
                }
                char stackBracket = bracket.pop();
                if (!checkIfMatching(stackBracket, c)) {
                    return false;
                }
            }
        }
        return bracket.empty();
    }

    boolean checkIfMatching(char bracket, char current) {
        switch (current) {
            case ')': return bracket == '(';
            case ']': return bracket == '[';
            case '}': return bracket == '{';
        }
        return false;
    }
}