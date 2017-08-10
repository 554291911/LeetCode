import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class No8_MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		while (l1 != null) {
			list.add(l1);
			l1 = l1.next;
		}
		while (l2 != null) {
			list.add(l2);
			l2 = l2.next;
		}
		Collections.sort(list, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode l1, ListNode l2) {
				return l1.val - l2.val;
			}
		});
		if (list.isEmpty())
			return null;
		if (list.size() > 1) {
			for (int i = 0; i < list.size() - 1; i++) {
				list.get(i).next = list.get(i + 1);
			}
			list.get(list.size() - 1).next = null;
		}
		return list.get(0);
	}

	public static void main(String[] args) {
		System.out.println(new No8_MergeTwoSortedLists().mergeTwoLists(null, null));
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}