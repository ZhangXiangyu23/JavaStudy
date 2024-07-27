package practice.YongYou;

/**
 * ClassName:test
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/5/26 15:34
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class test {
    public static ListNode rearrange(ListNode head, int n) {
        if (head == null || n <= 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null) {
            ListNode groupStart = head;
            ListNode groupEnd = head;

            // Find the end of the current group
            for (int i = 1; i < n && groupEnd.next != null; i++) {
                groupEnd = groupEnd.next;
            }

            // Check if the group has less than n nodes
            if (groupEnd.next == null && countNodes(groupStart) < n) {
                break;
            }

            ListNode nextGroupStart = groupEnd.next;
            groupEnd.next = null; // Cut the group

            // Sort the group
            ListNode sortedGroup = sortList(groupStart);

            // Attach sorted group to the previous part
            prev.next = sortedGroup;

            // Move prev to the end of the sorted group
            while (prev.next != null) {
                prev = prev.next;
            }

            // Connect to the next part of the list
            prev.next = nextGroupStart;
            head = nextGroupStart;
        }

        return dummy.next;
    }

    // Helper function to count nodes in a list
    private static int countNodes(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    // Helper function to sort a linked list using merge sort
    private static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    // Helper function to get the middle of the list
    private static ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    // Helper function to merge two sorted lists
    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    // Method to print the linked list (for testing purposes)
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(6);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        int n1 = 2;

        System.out.println("Original List:");
        printList(head1);

        ListNode result1 = rearrange(head1, n1);

        System.out.println("Rearranged List:");
        printList(result1);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        int n2 = 1;

        System.out.println("Original List:");
        printList(head2);

        ListNode result2 = rearrange(head2, n2);

        System.out.println("Rearranged List:");
        printList(result2);

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(3);
        head3.next.next = new ListNode(4);
        int n3 = 4;

        System.out.println("Original List:");
        printList(head3);

        ListNode result3 = rearrange(head3, n3);

        System.out.println("Rearranged List:");
        printList(result3);
    }
}

