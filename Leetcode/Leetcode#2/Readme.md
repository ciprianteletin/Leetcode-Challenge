# Add Two Numbers

**Problem link:** [LeetCode 2 - Add Two Numbers](https://leetcode.com/problems/add-two-numbers)

---

## Problem
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.


---

## Approach

1. We plan to iterate in parallel over the two lists. We add each element one by one + a remaining, which is 0 at the beginning. If the sum is over or equal to ten, we extract the % 10 and increase the remaining with 1
2. After the iteration is done, we iterate over the individual lists, because we could have cases where one list is bigger in length than the other
3. At the end, we check if the remaining is one. If yes, we add a new element to the list.


**Time Complexity:** O(n).
**Space Complexity:** O(n).  
