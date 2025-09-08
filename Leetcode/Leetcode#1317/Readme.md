# Convert Integer to the Sum of Two No-Zero Integers

**Problem link:** [LeetCode 1317 - Convert Integer to the Sum of Two No-Zero Integers](https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/)

---

## Problem
Given an integer `n`, return **two positive integers** `[a, b]` such that:

1. `a + b == n`
2. Neither `a` nor `b` contains the digit `0`.

You may return the answer in **any order**. It is guaranteed that at least one valid solution exists.

**Example:**  
Input: n = 11
Output: [2, 9]


---

## Approach

1. Start with the split `a = 1` and `b = n - 1`.  
2. Check if either `a` or `b` contains the digit `0`.  
   - To do this, repeatedly check each digit using `% 10`.  
3. If either number contains a `0`, increment `a` and decrement `b`, then check again.  
4. Return the first valid pair `[a, b]`.  

This works because:
- Eventually, there will always exist a decomposition of `n` into two no-zero numbers.
- We are guaranteed to find it by scanning sequentially.

**Time Complexity:** O(n)
**Space Complexity:** O(1).  
