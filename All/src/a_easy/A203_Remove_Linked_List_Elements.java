//package a_easy;
//
//
//import b_medium.ListNode;
//
//public class A203_Remove_Linked_List_Elements {
//    public static void main(String[] args) {
//        ListNode head = new ListNode(1, (new ListNode(2, new ListNode(6
//                , new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))));
//        System.out.println(removeElements(head, 6).toString());
//
//    }
//
//    public static ListNode removeElements(ListNode head, int val) {
//        ListNode head_node = new ListNode();
//        ListNode current_node = head_node;
//        while (head != null) {
//            if (head.next.val == val) {
//
//                current_node.next = head.next;
//                head = head.next.next;
////                current_node.val = head.val;
////                head = head.next;
//            } else {
//                current_node.next = head;
//                head = head.next;
//            }
//        }
//
//        return head_node.next;
//    }
//}
