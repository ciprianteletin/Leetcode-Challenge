# Find Most Frequent Vowel and Consonant

**Problem link:** [LeetCode 3541 - Find Most Frequent Vowel and Consonant](https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/)

---

## Problem
You are given a string s consisting of lowercase English letters ('a' to 'z').

Your task is to:

Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
Find the consonant (all other letters excluding vowels) with the maximum frequency.
Return the sum of the two frequencies.

Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. If there are no vowels or no consonants in the string, consider their frequency as 0.

The frequency of a letter x is the number of times it occurs in the string.
 
Example 1:

Input: s = "successes"

Output: 6

Explanation:

The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
The output is 2 + 4 = 6.

---

## Approach

1. We plan to iterate over the String and create an array of frequencies for both vowels and consonant.
2. After we have the frequencies, we iterate over the array. Using 2 variables, we store the maximum vowel and the maximum for the consonant.
3. We return the sum of the two maximum values.

**Time Complexity:** O(n).
**Space Complexity:** O(n).  
