class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int maxVowel = 0;
        int maxConsonant = 0;

        for (int i = 0; i < 26; i++) {
            if (i == 0 || i == 'e' - 'a' || i == 'i' - 'a' || i == 'o' - 'a' || i == 'u' - 'a') {
                if (freq[i] > maxVowel) {
                    maxVowel = freq[i];
                }
            } else {
                if (freq[i] > maxConsonant) {
                    maxConsonant = freq[i];
                }
            }
        }
        return maxVowel + maxConsonant;

    }
}