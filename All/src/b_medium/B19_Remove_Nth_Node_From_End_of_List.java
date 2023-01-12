package b_medium;

import org.junit.jupiter.api.Test;

public class B19_Remove_Nth_Node_From_End_of_List {
    @Test
    public void test() {
        ListNode node5 = new ListNode(6);
        ListNode node4 = new ListNode(5, node5);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        printListNode(removeNthFromEnd(head, 3));
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;
        else {
            int index = size(head) - n;
            ListNode currentNode = new ListNode();
            currentNode.val = head.val;
            head = head.next;
            ListNode result = currentNode;
            while (head != null) {
                if (index == 0 ) {
                    head = head.next;
                    result.next = head;
                    result = result.next;
                } else {
                    index--;
                    result.next = head;
                    head = head.next;
                    result = result.next;
                }
            }
            return currentNode;
        }

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
