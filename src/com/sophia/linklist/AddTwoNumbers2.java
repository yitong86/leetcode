package com.sophia.linklist;

import com.sophia.Main;

public class AddTwoNumbers2 {
    public static void main(String[] args) {

    }
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

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;
            int carry = 0;
            while (l1 != null || l2 !=null){
                int sum = 0;
                if(l1 != null){
                    sum += l1.val;
                    l1 = l1.next;

                }
                if(l2 != null){
                    sum += l2.val;
                    l2 = l2.next;
                }
                sum += carry;
                curr.next = new ListNode(sum%10);
                carry = sum/10;
                curr = curr.next;
            }
            if(carry>0){
                curr.next = new ListNode(carry);
            }
            return dummy.next;


    }
}
