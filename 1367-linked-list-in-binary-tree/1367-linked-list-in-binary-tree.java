class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;

        // Check from current node OR check in left/right subtree
        return check(head, root) || 
               isSubPath(head, root.left) || 
               isSubPath(head, root.right);
    }

    private boolean check(ListNode head, TreeNode node) {
        if (head == null) return true;   // Linked list fully matched
        if (node == null) return false;

        if (head.val != node.val) return false;

        return check(head.next, node.left) || 
               check(head.next, node.right);
    }
}