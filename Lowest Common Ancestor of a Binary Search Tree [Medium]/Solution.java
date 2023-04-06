/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node1 = root;
        ArrayList<TreeNode> pancestors = new ArrayList<>();
        pancestors.add(node1);
        while (node1.val != p.val) {
            if (node1.val < p.val) {
                node1 = node1.right;
                pancestors.add(node1);
            } else {
                node1 = node1.left;
                pancestors.add(node1);
            }
        }

        TreeNode node2 = root;
        ArrayList<TreeNode> qancestors = new ArrayList<>();
        qancestors.add(node2);
        while (node2.val != q.val) {
            if (node2.val < q.val) {
                node2 = node2.right;
                qancestors.add(node2);
            } else {
                node2 = node2.left;
                qancestors.add(node2);
            }
        }

        pancestors.retainAll(qancestors);
        return pancestors.get(pancestors.size() - 1);
    }
}
