package src;
/*
sorted Array = in order BST
1. If start > end, Return None.

2. find middle: mid = start + (end - start) / 2.

3. Initiate the root: root = TreeNode(nums[mid]).

4. Compute recursively start and end subtrees:
		root.left = helper(start, mid - 1),
		root.right = helper(mid + 1, end).

		Return createBST(0, nums.length - 1).

TC：O(n)  n is the total number of nodes in the tree.
SC：O(n)
*/



public class LC0108 {
        public TreeNode createBST(int[] nums, int start, int end) {
            if (start > end) return null;
            int mid = start + (end - start) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            root.left = createBST(nums, start, mid - 1);
            root.right = createBST(nums, mid + 1, end);
            return node;
        }

        public TreeNode sortedArrayToBST(int[] nums) {
            return createBST(0, nums.length - 1);
        }
}
