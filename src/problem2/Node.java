package problem2;
public class Node {
		// BST node
		int value;
		Node left; 
		Node right;
		//creation of new node
		static Node newNode(int data) {
			Node temp = new Node();
			temp.value = data;
			temp.left = null;
			temp.right = null;
			return temp;
		}
		public Node insert(Node root, int value) {
			if (root==null) {
				return newNode(value);
			}
			if (value<root.value) {
				root.left=insert(root.left,value);
			}else {
				root.right=insert(root.right,value);
			}
			return root;

		}

		public static void main(String[] args) {
			//created tree
			Node root=null;
			Node node=new Node();

			root=node.insert(root,40);
			root=node.insert(root,20);
			root=node.insert(root,60);
			root=node.insert(root,10);
			root=node.insert(root,30);
			root=node.insert(root,50);
			root=node.insert(root,70);
			System.out.println(root);
		}
	}	




