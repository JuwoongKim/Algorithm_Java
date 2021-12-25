package section7;

import java.util.*;

// 여기서  클래서  public , 또는 private 쓰면 어케 되는지 잘 알아야한다.
// 노노 궁금증 해결  public은 파일에서 하나만 가능함 
class Node{

    int val;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
        left= null;
        right = null;
    }
}


public class Five {

    Node root;

    // this is for 전위순회 
    public void DFS(Node n){

        System.out.print(n.val + " ");
        if(n.left !=null) DFS(n.left);
        if(n.right != null) DFS(n.right);
        
        return;
    }
    

    public void DFS2 (Node n){
        if(n.left !=null) DFS2(n.left);
        System.out.print(n.val + " ");
        if(n.right != null) DFS2(n.right);
    }


    public void DFS3 (Node n){
        if(n.left !=null) DFS3(n.left);
        if(n.right != null) DFS3(n.right);
        System.out.print(n.val + " ");
    }

    
    public void solution (Node n){

        DFS3(n);
    }



    public static void main(String [] arg){


        Five Tree = new Five();
        Tree.root = new Node(1);
        
        Tree.root.left = new Node(2);
        Tree.root.left.left = new Node(4);
        Tree.root.left.right = new Node(5);
        Tree.root.right = new Node(3);
        Tree.root.right.left = new Node(6);
        Tree.root.right.right = new Node(7);

        Tree.solution(Tree.root);


    }
}
