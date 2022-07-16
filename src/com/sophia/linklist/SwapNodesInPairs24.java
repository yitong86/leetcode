package com.sophia.linklist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNodesInPairs24 {
    public static void main(String[] args) {
//        Input: head = [1,2,3,4]
//        Output: [2,1,4,3]

    }

        public static ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode current = dummy;
            while(current.next != null && current.next.next != null){
                ListNode n1 = current.next;
                ListNode n2 = current.next.next;
                current.next = n2;
                n1.next = n2.next;
                n2.next = n1;
                current = n1;
            }
            return dummy.next;
        }
    }


