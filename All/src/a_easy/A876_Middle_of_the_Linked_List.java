package a_easy;

import org.junit.jupiter.api.Test;

public class A876_Middle_of_the_Linked_List {
    @Test
    public void test() {
        ListNode node5 = new ListNode(6);
        ListNode node4 = new ListNode(5, node5);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);

        printListNode(middleNode(head));
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        if (size(head) == 1) return head;
        int mid = size(head) / 2;
        ListNode resul = new ListNode();
        while (head != null) {
            if (mid == 1) {//tượng trưng cho số đếm
                resul = head.next;
                return resul;
            } else {
                mid--;
                head = head.next;
            }
        }
        return resul;
    }

    public int size(ListNode head) {
        if (head == null) return -1;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    private void printListNode(ListNode head) {
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
876. Middle of the Linked List
Easy
Companies
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

Constraints:
The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
 */
