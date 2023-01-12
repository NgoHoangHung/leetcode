package a_easy.A1290Convert_Binary_Number_in_a_Linked_List_to_Integer;

import a_easy.ListNode;
import org.junit.jupiter.api.Test;

public class A1290Convert_Binary_Number_in_a_Linked_List_to_Integer {
    @Test
    public void unitTest() {
        // data 1,1,2,3,3
        ListNode node4 = new ListNode(1);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(0, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(1, node1);
        System.out.println(getDecimalValue(head));
    }
    public int getDecimalValue(ListNode head) {
        if (head == null) return 0;
        else {
            int pow = size(head) - 1;
            int resul = 0;
            while (head != null) {
                if (head.val == 1) resul += Math.pow(2, pow);
                pow--;
                head = head.next;
            }
            return resul;
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
