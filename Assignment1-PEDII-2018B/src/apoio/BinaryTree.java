package apoio;
/* @author anderson.caye */
public class BinaryTree {

    private Node root;

    public BinaryTree(String s, Integer value) {
        Node n = new Node(s, value);
        this.root = n;
    }

    public Node getRoot() {
        return this.root;
    }

    public Node addLeftChild(Node p, String s, Integer value) {
        if (p.left != null) {
            System.err.println("node has left child");
            return null;
        }
        Node n = new Node(s, value);
        n.parent = p;
        p.left = n;
        return n;
    }
    
    public Node addRightChild(Node p, String s, Integer value) {
        if (p.right != null) {
            System.err.println("node has right child");
            return null;
        }
        Node n = new Node(s, value);
        n.parent = p;
        p.right = n;
        return n;
    }
    
    public int depth (Node n){
        int c = 0;
        while(n.parent != null){
            c++;
            n = n.parent;
        }
        return c;
    }
    
    public int height(Node n){
        //base case
        if(n.isExternal()){ return 0; }
        
        //general case
        int x = 0, y = 0;
        if (n.left != null) { x = height(n.left); }
        if (n.right != null) { y = height(n.right); }
        return Math.max(x, y) + 1;
    }
    
    public void print(Node n){
        //base case
        if(n.isExternal()) { 
            System.out.println(n);
            return;
        }
        
        //general case
        System.out.println(n);
        if (n.left != null) { print(n.left);  }
        if (n.right != null) { print(n.right); }
    }
    
    public String toString(){
        return null;
    }
            
}
