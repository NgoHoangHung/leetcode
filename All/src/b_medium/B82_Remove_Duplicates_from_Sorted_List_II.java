package b_medium;

import org.junit.jupiter.api.Test;

public class B82_Remove_Duplicates_from_Sorted_List_II {
    @Test
    public void unitTest() {
        //data
        ListNode node4 = new ListNode(5);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        printListNode(head);
//        printListNode(reverseList(head));


//        previousNode.val = head.val;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode result = new ListNode();
        ListNode currentNode = new ListNode();
        ListNode previousNodeSave = result;

        boolean flag = true;
        while (head != null) {
            currentNode.val = head.val;
            head = head.next;
            if (currentNode.val != head.val && flag) {
                ListNode tmp = new ListNode(currentNode.val, null);
                previousNodeSave.val = tmp.val;

            } else if (currentNode.val != head.val && !flag) {

            } else if (currentNode.val == head.val && !flag) {

            } else if (currentNode.val == head.val && flag) {
                flag = false;
                head = head.next;
            }


        }

        return result;
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
