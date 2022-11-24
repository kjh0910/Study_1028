package week_5;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		/* *****************************************
		 *  출처: https://minhamina.tistory.com/83
		 * 	코드 그대로 복붙했습니다 
		 * *****************************************
		 * 
		 * <트리 순회>
		 * 
		 * 이진 트리를 입력받아 전위 순회(preorder traversal), 중위 순회(inorder traversal), 
		 * 후위 순회(postorder traversal)한 결과를 출력하는 프로그램을 작성하시오.
		 * 
		 * 		    A
		 *         / \
		 *        B	  C  
		 *       / 	 / \
		 *      D 	E   F
		 *               \
		 *                G
		 *                
		 * 예를 들어 위와 같은 이진 트리가 입력되면,
		 * 
		 * 전위 순회한 결과 : ABDCEFG // (루트) (왼쪽 자식) (오른쪽 자식)
		 * 중위 순회한 결과 : DBAECFG // (왼쪽 자식) (루트) (오른쪽 자식)
		 * 후위 순회한 결과 : DBEGFCA // (왼쪽 자식) (오른쪽 자식) (루트)
		 * 
		 * 
		 * */
		
		Set<Node> lhs =new LinkedHashSet<Node>();
		TreeOrderClass t = new TreeOrderClass();
		
		String a = "A";
		String b = "B";
		String c = "C";
		String d = "D";
		String e = "E";
		String f = "F";
		String g = "G";
	
		t.createNode(a, b, c);
		t.createNode(b, d, "-1");
		t.createNode(c, e, f);
		t.createNode(f, "-1", g);
		
		System.out.println("전위 순회");
		t.preOrder(t.root);
		System.out.println();
		System.out.println("중위 순회");
		t.inOrder(t.root);
		System.out.println();
		System.out.println("후위 순회");
		t.postOrder(t.root);
		System.out.println();
		
		
		
		
		
	}

}


class TreeOrderClass {
	public Node root;
	
	public void createNode(String data, String leftData, String rightData) {
		if(root == null) {
			root = new Node(data);
			
			if(leftData != "-1") {
				root.left = new Node(leftData);
			}
			if(rightData != "-1") {
				root.right = new Node(rightData);
			}
			
		} else {
			searchNode(root, data, leftData, rightData);
		}
	}
	
	public void searchNode(Node node, String data, String leftData, String rightData) {
		if(node == null) {
			return;
		} else if(node.data == data) {
			if(leftData != "-1") {
				node.left = new Node(leftData);
			}
			if(rightData != "-1") {
				node.right = new Node(rightData);
			}
			
		} else {
			searchNode(node.left, data, leftData, rightData);
			
			searchNode(node.right, data, leftData, rightData);
			
		}
		
	}
	
	public void preOrder(Node node) {
		if(node != null) {
			System.out.print(node.data + " ");
			if(node.left != null) preOrder(node.left);
			if(node.right != null) preOrder(node.right);
		}
		
	}
	
	public void inOrder(Node node) {
		if(node != null) {
			if(node.left != null) inOrder(node.left);
			System.out.print(node.data + " ");
			if(node.right != null) inOrder(node.right);
		}
		
	}
	
	public void postOrder(Node node) {
		if(node != null) {
			if(node.left != null) postOrder(node.left);
			if(node.right != null) postOrder(node.right);
			System.out.print(node.data + " ");
		}
		
	}

}




class Node {
	
	String data;
	Node left;
	Node right;
	
	public Node(String data) {
		super();
		this.data = data;
	}

}
