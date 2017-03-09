/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class No2_AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode((l1.val + l2.val) % 10);
		int index = 0;
		if (l1.val + l2.val >= 10)
			index = 1;
		l1 = l1.next;
		l2 = l2.next;
		ListNode node = head;
		while (l1 != null || l2 != null || index != 0) {
			int sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + index;
			node.next = new ListNode(sum % 10);
			if (sum >= 10)
				index = 1;
			else
				index = 0;
			node = node.next;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
		ListNode head = new No2_AddTwoNumbers().addTwoNumbers(l1, l2);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}