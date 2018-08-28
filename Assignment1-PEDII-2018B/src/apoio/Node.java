package apoio;
/* @author anderson.caye*/
public class Node {
    public Node parent;
    public Node left;
    public Node right;
    public String element;
    
    public Node(String s){
        this.element = s;
    }
    
    public boolean isRoot() {
        return this.parent == null;
    }
    
    public boolean isExternal(){
        return this.left == null && this.right == null;
    }
    
    public boolean isInternal(){
        return ! isExternal();
    }
    
    public String toString(){
        return this.element;
    }
}
