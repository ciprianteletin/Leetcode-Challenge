# Maximum Depth of Binary Tree

**Problem link:** [LeetCode 104 - Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

---

## Problem
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: 3

---

## Approach

1. We have to develop a recursive solution to iterate over the tree.
2. If the root element (current) is null, we return 0
3. Otherwise, we are interested, for each node, in the maximum depth between the left and the right subtree.
4. Recursively, we call the method for the right and left side.
5. At the end, we return the maximum depth between the left and the right side + 1, as a value of the current node

**Time Complexity:** O(n).
**Space Complexity:** O(n).  
