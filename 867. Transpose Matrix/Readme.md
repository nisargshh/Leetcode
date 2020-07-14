# 867. Transpose Matrix

# Question

## Question

Given a matrix `A`, return the transpose of `A`.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.

![https://assets.leetcode.com/uploads/2019/10/20/hint_transpose.png](https://assets.leetcode.com/uploads/2019/10/20/hint_transpose.png)

## **Example 1:**

```
Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
```

## **Example 2:**

```
Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
```

## **Note:**

1. `1 <= A.length <= 1000`
2. `1 <= A[0].length <= 1000`

## Link

[Transpose Matrix - LeetCode](https://leetcode.com/problems/transpose-matrix/)

# Solution

## Code

```java
class Solution {
    public int[][] transpose(int[][] A) {
        int[][] intArray = new int[A[0].length][A.length];

        for(int i = 0; i < A[0].length; i++){
            for(int j = 0; j< A.length; j++){
                intArray[i][j] = A[j][i];
            }
        }
        return intArray;
    }
}
```
