# 881. Boats to Save People

# Question

## Question

We are given `head`, the head node of a linked list containing **unique integer values**. We are also given the list `G`, a subset of the values in the Return the number of connected components in `G`, where two values are connected if they appear consecutively in the linked list.linked list. The `i`-th person has weight `people[i]`, and each boat can carry a maximum weight of `limit`. Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most `limit`.Return the minimum number of boats to carry every given person. (It is guaranteed each person can be carried by a boat.)

## **Example 1:**

```
Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
```

## **Example 2:**

```
Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
```

## **Example 3:**

```
Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
```

## **Note:**

- `1 <= people.length <= 50000`
- `1 <= people[i] <= limit <= 30000`

## Link

[Boats to Save People - LeetCode](https://leetcode.com/problems/boats-to-save-people/)

# Solution

## Code

```java
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int i,j;
        for(i =0, j = people.length - 1; i <= j; j--){
            if(people[i] + people[j] <= limit){
                i++;
            }
        }
         return people.length - 1 - j;
    }
}
```
