package zxy.linkedlist04;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/10/23 21:45
 */
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4, null);

        //进行链接
        head.next = two;
        two.next = three;
        three.next = four;

        Solution solution = new Solution();
        solution.swapPairs(head);


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
    //两两交换链表中节点的元素
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return head;
        }
        //虚拟头节点
        ListNode Dummy = new ListNode(-1, head);
        //当前节点
        ListNode cur = head;
        //前一个节点
        ListNode pre = Dummy;
        //链表节点为奇数cur.next == null
        //链表节点为偶数cur.next.next == null
        while(cur != null && cur.next != null){
            ListNode temp1 = pre.next;
            ListNode temp2 = cur.next.next;
            //进行交换
            pre.next = cur.next;
            cur.next.next = temp1;
            temp1.next = temp2;
            //移动cur和pre
            pre = pre.next.next;
            cur = pre.next;
        }
        return Dummy.next;

    }
}
