# Missing Number

**Problem link:** [LeetCode 268 - Missing Number](https://leetcode.com/problems/missing-number/)

---

## Problem
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

**Example:**  
Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

---

## Approach

1. We plan to iterate with a for loop over the array and add all the numbers into a variable sum.   
2. After the for loop is completed, we use a mathematical formula to find the sum of n numbers. We substract our sum from the n numbers sum to find the missing number.

**Time Complexity:** O(n)
**Space Complexity:** O(1).  
