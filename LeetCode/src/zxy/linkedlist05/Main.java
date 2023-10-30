package zxy.linkedlist05;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/10/24 19:54
 */
public class Main {
    public static void main(String[] args) {
       ListNode head = new ListNode(1);
       ListNode two = new ListNode(2);
       ListNode three = new ListNode(3);
       ListNode four = new ListNode(4);
       ListNode five = new ListNode(5);

       //进行链接
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        Solution solution = new Solution();
        solution.removeNthFromEnd(head, 2);


    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //使用快慢指针的思路
        //创建一个虚拟头节点
        ListNode dummy = new ListNode(-1, head);
        //快指针
        ListNode fast = head;
        //慢指针
        ListNode slow = head;
        //让快指针先走n+1步
        while(n >= 0){
            fast = fast.next;
            n--;
        }
        //然后快慢指针一起走
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        //删除节点
        slow.next = slow.next.next;
        return dummy.next;

    }

}
