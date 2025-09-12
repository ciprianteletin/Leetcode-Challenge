# Valid Parentheses

**Problem link:** [LeetCode 20 - Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

---

## Problem
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

---

## Approach

1. We plan to iterate over the String, and with the help of a Stack, to keep track of the Parentheses
2. If the bracket is open ( type `(`, `[`, `{` ), we add it into the Stack. Otherwise, we pop the element from the Stack (LIFO, if the Stack is empty) and we check if we have a matching pair. Otherwise, we return false.
3. At the end of for loop, we check to see if the stack is empty. In case it is not empty, it means that we have brackets that are not matched.

**Time Complexity:** O(n)
**Space Complexity:** O(n).  
