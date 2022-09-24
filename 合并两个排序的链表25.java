package SuanFa;

public class 合并两个排序的链表25 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        ListNode head4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        head4.next=node5;
        node5.next=node6;
        PrintListNode(mergeTwoLists(null,head4));
    }
    public static void PrintListNode(ListNode head){
        ListNode cur = head;
        while (cur!=null){
            System.out.print(cur.val+"->");
            cur=cur.next;
        }
        System.out.print("null");
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null&&l2==null){
            return null;
        }
        if (l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }//之后l1和l2都不为空
        ListNode Head = new ListNode(66);//设置头节点
        ListNode t = Head;
        ListNode p = l1;
        ListNode q = l2;
        while (p!=null && q!=null){
            if (p.val<=q.val){
                t.next=p;
                t=t.next;
                p=p.next;
            }else {
                t.next=q;
                t=t.next;
                q=q.next;
            }
        }//l1 或 l2 一个为空
        t.next=p==null?q:p;
        return Head.next;
    }
}
