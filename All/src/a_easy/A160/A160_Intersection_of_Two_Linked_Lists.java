package a_easy.A160;

import org.junit.jupiter.api.Test;

public class A160_Intersection_of_Two_Linked_Lists {
    @Test
    public void unitTest() {
        //data
//        ListNode nodeA4 = new ListNode(5);
//        ListNode nodeA3 = new ListNode(4, nodeA4);
//        ListNode nodeA2 = new ListNode(8, nodeA3);
//        ListNode nodeA1 = new ListNode(1, nodeA2);
//        ListNode headA = new ListNode(4, nodeA1);
//
//        ListNode nodeB4 = new ListNode(5);
//        ListNode nodeB3 = new ListNode(4, nodeB4);
//        ListNode nodeB2 = new ListNode(8, nodeB3);
//        ListNode nodeB1 = new ListNode(1, nodeB2);
//        ListNode nodeB11 = new ListNode(6, nodeB1);
//        ListNode headB = new ListNode(5, nodeB11);
//        printListNode(headA);
//        printListNode(headB);
//        printListNode(getIntersectionNode(headA, headB));

    }



    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode result = new ListNode();
        ListNode reverseListA = reverseList(headA);
        ListNode reverseListB = reverseList(headB);
        if (reverseListA.val != reverseListB.val) return null;
        else {
            result = new ListNode();
            result.val = reverseListA.val;
            reverseListA = reverseListA.next;
            reverseListB = reverseListB.next;
            while (reverseListA != null) {
                if (reverseListA.val * reverseListB.val != 1 &&
                        reverseListA.val == reverseListB.val) {
                    ListNode current = reverseListA;
                    reverseListA = reverseListA.next;
                    reverseListB = reverseListB.next;
                    current.next = result;
                    result = current;
                } else {
                    return new ListNode(result.val, null);
                }
            }
            return result;
        }
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

    public int size(ListNode head) {
        if (head == null) return -1;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
