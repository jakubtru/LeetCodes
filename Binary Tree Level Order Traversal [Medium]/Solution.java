/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class Solution {
    List<List<Integer>> listWithLevel = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        int maxLevel = 0;
      
        if (root != null) {
            traverse(root, 0);
        } else {
            return results;
        }
      
        for (int i = 0; i < listWithLevel.size(); i++) {
            if (listWithLevel.get(i).get(0) > maxLevel) {
                maxLevel = listWithLevel.get(i).get(0);
            }
        }
        for (int i = 0; i <= maxLevel; i++) {
            List<Integer> mergedList = new ArrayList();
            for (var list : listWithLevel) {
                if (!list.isEmpty()) {
                    if (list.get(0) == i) {
                        list.remove(0);
                        mergedList.addAll(list);
                    }
                }
            }
            results.add(mergedList);
        }
        return results;
    }

    public void traverse(TreeNode root, int levelsDown) {
        if (root == null) {
            return;
        }
        List<Integer> levelledList = new ArrayList();
        levelledList.add(levelsDown);
        levelledList.add(root.val);
        if (root.left != null) {
            traverse(root.left, levelsDown + 1);
        }
        if (root.right != null) {
            traverse(root.right, levelsDown + 1);
        }
        listWithLevel.add(levelledList);
    }
}
