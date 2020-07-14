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