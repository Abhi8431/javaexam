package javapractice;

class Node {
int data;
Node left, right;
Node(int data){
this.data = data;
this.left = this.right = null;
}
}
public class prog13_BinaryTree {
public static Node getTree(){
Node root = new Node(5);
root.left = new Node(2);
root.right = new Node(6);
root.left.left = new Node(1);
root.left.right = new Node(4);
root.left.right.left = new Node(3);
root.right.right = new Node(8);
root.right.right.right = new Node(9);
root.right.right.left = new Node(7);
return root;
}
public static int difference(Node node){
if(node == null) 
	return 0;
return node.data - difference(node.left) - difference(node.right);
}
public static void main(String args[]){
Node tree = getTree();
System.out.println(difference(tree));
}
}
