# 817. Linked List Components

# Question

## Question

We are given `head`, the head node of a linked list containing **unique integer values**. We are also given the list `G`, a subset of the values in the Return the number of connected components in `G`, where two values are connected if they appear consecutively in the linked list.linked list.

## **Example 1:**

```
Input:
head: 0->1->2->3
G = [0, 1, 3]
Output: 2
Explanation:
0 and 1 are connected, so [0, 1] and [3] are the two connected components.

```

## **Example 2:**

```
Input:
head: 0->1->2->3->4
G = [0, 3, 1, 4]
Output: 2
Explanation:
0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.

```

## **Note:**

- If `N` is the length of the linked list given by `head`, `1 <= N <= 10000`.
- The value of each node in the linked list will be in the range `[0, N - 1]`.
- `1 <= G.length <= 10000`.
- `G` is a subset of all values in the linked list.

## Link

[Linked List Components - LeetCode](https://leetcode.com/problems/linked-list-components/)

# Solution

## Code

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : G){
            set.add(i);
        }
        int res = 0;
        ListNode data = head;
        while(data != null){
            if(set.contains(data.val) && (data.next == null || !set.contains(data.next.val))){
                res++;
            }
            data = data.next;
        }
        return res;
    }
}
```
