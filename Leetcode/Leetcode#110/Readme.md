# Balanced Binary Tree

**Problem link:** [LeetCode 110 - Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)

---

## Problem
Determine if a binary tree is height-balanced.

A binary tree is considered height-balanced if, for each node, the difference in height between its left and right subtrees is no more than one.

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: true

---

## Approach

1. We have to develop a recursive solution to iterate over the tree.
2. We plan to have two methods, one for depth calculation, and one to determine, based on the dept result, if the tree is balanced or not
3. Similarely to `Leetcode#104`, we calculate the depth of the right and the left side. If the difference between the two, in absolute, is greather than 1, then we return -1. During the recursive call, if we received -1 down the line, we pass -1 to the top of the recursive stack.
4. In the main method, we check if the depth algorithm return -1 or not, basically returning depth != -1 (for balanced)

**Time Complexity:** O(n).
**Space Complexity:** O(n).  
