package cn.edu.chd.li;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/15 20:10
 */
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListLengthWithDeduplication {
    public static int getLinkedListLength(ListNode head) {
        int length = 0;
        HashSet<Integer> seen = new HashSet<>();

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if (!seen.contains(current.val)) {
                seen.add(current.val);
                length++;
                prev = current;
            } else {
                // Remove duplicate node
                prev.next = current.next;
            }
            current = current.next;
        }

        return length;
    }

    public static void main(String[] args) {
        // 创建示例链表: 1 -> 2 -> 3 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        int length = getLinkedListLength(head);

        System.out.println("链表的长度是: " + length);
    }
}
