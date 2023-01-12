package a_easy;


/*
21. Merge Two Sorted Lists
Easy
Companies
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
(_1_)*****>(_2_)*****>(_4_)
'1'----->'3'----->'4'
____________________
                    |======>'1'----->(_1_)----->(_2_)----->'3'----->(_4_)----->'4'
Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */
public class A21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head_node = new ListNode();
        ListNode current_node = head_node;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current_node.next = list1;
                list1 = list1.next;
            } else {
                current_node.next = list2;
                list2 = list2.next;
            }
            current_node = current_node.next;
        }
        if (list1 != null) {
            current_node.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            current_node.next = list2;
            list2 = list2.next;
        }
        return head_node.next;
    }
}
