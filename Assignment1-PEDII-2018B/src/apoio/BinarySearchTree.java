package apoio;

import java.util.ArrayList;
import run.Line;

public class BinarySearchTree {

    private BinaryTree tree;

    public BinaryTree getTree() {
        return tree;
    }

    public BinarySearchTree(ArrayList<Line> array) {
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getHistory().length == 1){
                this.tree = new BinaryTree(array.get(i).getElement().element);
            }
        }
    }
    
    public boolean insert(String s) {
//        if (this.tree.getRoot() == null){
            Node n = this.tree.getRoot();
//        } else {
            while (n != null){
                if(n.element.equals(s)){
                    return true;
                }
                if(Double.parseDouble(s) < Double.parseDouble(n.element)){
                    if(n.left == null){ n.left = new Node(s); } else { n = n.left; }
                }
                if(Double.parseDouble(s) > Double.parseDouble(n.element)){
                    if(n.right == null){ n.right =  new Node(s); } else { n = n.right; }
                }
            }
//        }
        return false;
    }
    
    public boolean contains(String s) {
        Node n = this.tree.getRoot();

        while (n != null) {
            if (n.element.equals(s)) {
                return true;
            }

            if (Double.parseDouble(s) < Double.parseDouble(n.element)) {
                n = n.left;
            } else {
                n = n.right;
            }
        }

        return false;
    }
    
    
}
