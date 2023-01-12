package a_easy.A83_Remove_Duplicates_from_Sorted_List;

import a_easy.ListNode;
import org.junit.jupiter.api.Test;

public class A83_Remove_Duplicates_from_Sorted_List {
    @Test
    public void unitTest() {
        // data 1,1,2,3,3
        ListNode node4 = new ListNode(3);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(1, node1);
        printListNode(deleteDuplicates(head));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        else {
            ListNode result = new ListNode();
            result.val = head.val;
            head = head.next;
            ListNode currentNode = result;
            while (head != null) {
                if (currentNode.val != head.val) {
                    ListNode tmp = new ListNode(head.val, null);
                    currentNode.next = tmp;
                    currentNode = currentNode.next;
                }
                head = head.next;
            }
            return result;
        }
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
