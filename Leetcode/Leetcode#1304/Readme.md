# Find N Unique Integers Sum up to Zero #1304

**Problem link:** [LeetCode 1304 - Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)

## Problem
Given an integer `n`, return any array containing `n` **unique integers** such that they sum up to 0.  
You may return the answer in **any order**.

**Example:**  
Input: n = 5
Output: [-2,-1,1,2,0]

---

## Approach

1. **Observation**:
   - If `n` is even, we can pair numbers like `(1, -1), (2, -2), ...` until we reach `n`.
   - If `n` is odd, we include `0` and then pair numbers as above.

2. **Algorithm**:
   - Initialize an array of size `n`.
   - If `n` is 1 → just return `[0]`.
   - If `n` is even → fill array in pairs: `i` and `-i`.
   - If `n` is odd → set first element `0`, then fill remaining elements in pairs: `i` and `-i`.

**Time Complexity:** O(n) — each element is assigned once  
**Space Complexity:** O(n) — array of size `n`