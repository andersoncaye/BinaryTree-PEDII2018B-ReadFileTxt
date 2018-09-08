package apoio;
/* @author anderson.caye*/
public class Node {
    public Node parent;
    public Node left;
    public Node right;
    public String element;
    public int value;
    
    public Node(String s, Integer value){
        this.element = s;
        this.value = value;
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
