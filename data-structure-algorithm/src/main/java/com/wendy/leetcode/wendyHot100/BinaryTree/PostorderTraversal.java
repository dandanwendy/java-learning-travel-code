package com.wendy.leetcode.wendyHot100.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null) return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
