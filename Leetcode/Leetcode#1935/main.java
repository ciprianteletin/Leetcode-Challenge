class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> broken = new HashSet<>();
        int count = 0;
        for (int i = 0; i < brokenLetters.length(); i++) {
            broken.add(brokenLetters.charAt(i));
        }

        boolean flag = true;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == ' ') {
                if (flag) {
                    count++;
                }
                flag = true;
            } else {
                if (broken.contains(current)) {
                    flag = false;
                }
            }
        }

        if (flag == true) {
            count++;
        }

        return count;
    }
}