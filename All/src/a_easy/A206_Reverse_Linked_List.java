package a_easy;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class A206_Reverse_Linked_List {
    @Test
    public void unitTest() {
        //data
        ListNode node4 = new ListNode(5);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        printListNode(head);
        printListNode(reverseList(head));


//        previousNode.val = head.val;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode previousNode = new ListNode();
        previousNode.val = head.val;
        head = head.next;
        while (head != null) {
            ListNode currentNode = head;
            head = head.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
        }
        return previousNode;
    }

    public void printListNode(ListNode head) {
        if (head == null) System.out.println("List is Empty");
        else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else
                    System.out.println();
            }
        }

    }

}
/*
206. Reverse Linked List
Easy
15.7K
262
Companies
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []


Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000


Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
