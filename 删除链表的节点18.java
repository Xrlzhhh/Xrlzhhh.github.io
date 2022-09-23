package SuanFa;

public class 删除链表的节点18 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
    }
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val==val){
            return head.next;
        }//head不为空 且 head不为要删除的节点
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur!=null){
            if (!(cur.val==val)){
                pre=cur;
                cur=cur.next;
            }else {
                pre.next=cur.next;
                break;
            }
        }
        return head;
    }
}
