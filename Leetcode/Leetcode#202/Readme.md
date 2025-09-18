# Happy Number

**Problem link:** [LeetCode 202 - Happy Number](https://leetcode.com/problems/happy-number/)

---

## Problem
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1


---

## Approach

1. We have two while loops, one for digits sum, other for checking if our number is one.
2. In order to avoid a continuous loop, we can create a HashSet, which will contain our sums. If one of the sums appears twice, then we are returning false, since we are getting into a loop.


**Time Complexity:** O(log n).
**Space Complexity:** O(n), where n is the number of elements  
