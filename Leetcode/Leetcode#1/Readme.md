# Valid Palindrome

**Problem link:** [LeetCode 1 - Two Sum](https://leetcode.com/problems/two-sum)

---

## Problem
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]


---

## Approach

1. We have two solutions, with one being the brute force method. We will go with a faster one, regarding time complexity.
2. We plan to iterate over the array, and for each element, build a Map with the last index appearence.
3. On each element, we check if there is already an element in the map with the value of target - current.
4. If we have one, then we simply return that pair of indexes. Otherwise, we move forward.


**Time Complexity:** O(n).
**Space Complexity:** O(n).  
