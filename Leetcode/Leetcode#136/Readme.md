# Single Number

**Problem link:** [LeetCode 136 - Single Number](https://leetcode.com/problems/single-number/)

---

## Problem
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

**Example:**  
Input: nums = [2,2,1]
Output: 1

---

## Approach

1. We plan to iterate with a for loop over the array. 
2. Using the xor operator (^) we can find out the number that is unique. Any number ^ with itself will result to 0, where any number ^ 0 will equal the number.    
3. Return the result 

**Time Complexity:** O(n)
**Space Complexity:** O(1).  
