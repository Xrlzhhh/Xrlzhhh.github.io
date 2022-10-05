package Test_2022_10;


import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Test01 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6= new TreeNode(6);
        TreeNode t7 = new TreeNode(8);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        t4.left=t6;
        t5.left=t7;
        List<Integer> list = new ArrayList<>();
        list = leverOrder2(t1,list,1);
        System.out.println(list);
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(list.get(1));
        lists.add(list2);
        List<Integer> result = new ArrayList<>();
        for(int i=2; i<list.size();i++){
            if (list.get(i)!=null){
                result.add(list.get(i));
                continue;
            }
            if(!result.isEmpty()){
                lists.add(new ArrayList<>(result));
            }
            result.clear();
        }
        lists.add(result);
        System.out.println(lists);
    }
    /*public List<List<Integer>> levelOrder(TreeNode root) {

    }*/
    public static List<Integer> leverOrder2(TreeNode root , List<Integer> list, int i){
        if (root==null){
            return null;
        }
        int length = list.size();
        if (length<=i){
            for(int j=0;j<=i-length;j++){
                list.add(j+length,null);
            }
        }
        list.set(i,root.val);
        leverOrder2(root.left,list,2*i);
        leverOrder2(root.right,list,2*i+1);
        return list;
    }
    public void preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root==null){
            return;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}
