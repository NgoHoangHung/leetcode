package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class A234_Palindrome_Linked_List {
//    @Test
//    public void unitTest() {
    //data
//        ListNode head = new ListNode(15, new ListNode(22, new ListNode(2, new ListNode(1))));
//        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
//        printListNode(reverseList(head1));
//        printListNode(head1);
//        Assertions.assertEquals(true, isPalindrome(head));
//        Assertions.assertEquals(true, isPalindrome(head1));
//    }

    public boolean isPalindrome(ListNode head) {
        ListNode reverseHead = reverseList(head);
        while (head != null) {
            if (reverseHead.val != head.val)
                return false;
            reverseHead = reverseHead.next;
            head = head.next;
        }
        return true;
    }


    private ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode clone = new ListNode();
        ListNode previousNode = new ListNode();
        previousNode.val = head.val;
        clone.val = head.val;
        clone.next = head.next;
        head = head.next;
        while (head != null) {
            ListNode currentNode = head;
            head = head.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
        }
        head = clone;
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
                } else System.out.println();
            }
        }

    }

}
/*
Given the head of a singly linked list, return true if it is a
palindrome
 or false otherwise.
Example 1:
(1)->(2)->(3)->(2)->(1)

Input: head = [1,2,3,2,1]
Output: true

Example 2:
(1)->(2)

Input: head = [1,2]
Output: false
 */
