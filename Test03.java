package Test_2022_10;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Test03 test03 = new Test03();
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        System.out.println(test03.validateStackSequences(pushed, popped));
    }
    public boolean verifyPostorder(int[] postorder) {
        return helper(postorder,0,postorder.length-1);
    }

    private boolean helper(int[] postorder, int left, int right) {
        if (left>=right) return true;
        int index = left;
        while (index<right){
            if (postorder[index]<postorder[right]){
                index++;
            }else break;
        }
        int mid = index;
        while (index<right){
            if (postorder[index]<postorder[right]) return false;
            index++;
        }
        return helper(postorder,left,mid-1) && helper(postorder,mid,right);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {//II. 从上到下打印二叉树 II
        List<List<Integer>> lists = new ArrayList<>();
        if (root==null) return lists;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i=1 ; i<=size ; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            lists.add(list);;
        }
        return lists;
    }
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        while (i<popped.length){
            stack.push(pushed[i]);
            i++;
            while (!stack.isEmpty() && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return res(root.left,root.right);
    }

    private boolean res(TreeNode left, TreeNode right) {
        if (left==null && right==null) return true;
        if (left==null || right==null || left.val!=right.val) return false;
        return res(left.left,right.right) && res(left.right,right.left);
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root==null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node.left!=null) stack.push(node.left);
            if (node.right!=null) stack.push(node.right);
            TreeNode tmp = node.left;
            node.left=node.right;
            node.right=tmp;
        }
        return root;
    }

}
