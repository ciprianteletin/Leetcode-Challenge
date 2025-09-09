# Pascal's Triangle #118

**Problem link:** [LeetCode 118 - Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)

---

## Problem
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]

---

## Approach

1. **Observation**:
   - If `numRows` is one, we return a simple matrix [[1]]
   - If `numRows` is bigger than 1, then we have, for each element, to get the sum arr[i-1][j-1] + arr[i-1][j], if the indexes respects the prev. array boundaries. 


2. **Algorithm**:
   - Prepare the base case, for `numRows` 1 .
   - Iterate, with a for loop, starting from 1 to numRows.
   - Store in a variable for simplicity the previous row from the Matrix.
   - With a second, inner for loop, generate the next number into the current row
   - Add at the finish of the second loop the generated array.

**Time Complexity:** O(n^2) — we have two for loops that are used for the Matrix generation. 
**Space Complexity:** O(n^2) — in the end, the result will be a Matrix of numRows*numRows.