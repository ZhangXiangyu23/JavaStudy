package zxy.linkedlist01;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/10/21 21:27
 */
public class Main {
    public static void main(String[] args) {
        //创建节点
        LinkedNode head = new LinkedNode(1);
        LinkedNode two = new LinkedNode(2);
        LinkedNode three = new LinkedNode(3);
        LinkedNode four = new LinkedNode(4);
        //进行链接
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = null;
        //相当于是一个游标
        LinkedNode cur = head;
        //遍历链表
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }

    }
}


//创建节点
class LinkedNode{
    int val;
    LinkedNode next;

    //无参构造
    public LinkedNode() {
    }
    //单个参数构造
    public LinkedNode(int val) {
        this.val = val;
    }
    //多参构造
    public LinkedNode(int val, LinkedNode next) {
        this.val = val;
        this.next = next;
    }
}

