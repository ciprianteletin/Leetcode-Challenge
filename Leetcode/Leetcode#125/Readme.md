# Valid Palindrome

**Problem link:** [LeetCode 125 - Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

---

## Problem
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

---

## Approach

1. We iterate over the charArray and we build the original string, as well as the reverse at the same tiem
2. If the character is not digit or letter, we skip it, otherwise we add it to the string (for the uppercase character, we add +32)
3. We check if the strings are equals

Better approach: two pointers at the left and right

**Time Complexity:** O(n).
**Space Complexity:** O(n).  
