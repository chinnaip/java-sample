package in.conceptarchitect.collections;

public class BinarySearchTree {

	IntTreeNode root;
	
	public IntTreeNode add(IntTreeNode root, IntTreeNode newNode) {
		if(root==null)
			root=newNode;
		else if(newNode.value<root.value)
			root.left=add(root.left,newNode);
		else
			root.right=add(root.right,newNode);
	
		return root;
	}
	
	public void preorder(IntTreeNode node) {
		if(node==null)
			return;
		
		System.out.println(node.value);
		preorder(root.left);
		preorder(root.right);
	}
	
	public void inorder(IntTreeNode node) {
		if(node==null)
			return;
		
		inorder(root.left);
		System.out.println(node.value);
		inorder(root.right);
	}
	
	public void postorder(IntTreeNode node) {
		if(node==null)
			return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(node.value);
	}
	
}
