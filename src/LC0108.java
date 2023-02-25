package src;
/*
sorted Array = in order BST
1. If start > end, Return None.

2. find middle: mid = start + (end - start) / 2.

3. Initiate the root: root = TreeNode(num[mid]).

4. Compute recursively start and end subtrees:
		root.left = helper(start, mid - 1),
		root.right = helper(mid + 1, end).

		Return createBST(0, num.length - 1).

TC：O(n)  n is the total number of nodes in the tree.
SC：O(n)
*/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
}


public class LC0108 {
    int[] num;
        public TreeNode createBST(int start, int end) {
            if (start > end) return null;
            int mid = start + (end - start) / 2;
            TreeNode node = new TreeNode(num[mid]);
            node.left = createBST(start, mid - 1);
            node.right = createBST(mid + 1, end);
            return node;
        }

        public TreeNode sortedArrayToBST(int[] num) {
            this.num = num;
            return createBST(0, num.length - 1);
        }
}
