package apoio;

import java.util.ArrayList;
import java.util.TreeMap;
import run.Line;
import run.Pares;

public class BinarySearchTree {

    private BinaryTree tree;
    private ArrayList<Line> array;
    private TreeMap<Integer, Pares> d;

    public BinaryTree getTree() {
        return tree;
    }

    public BinarySearchTree(ArrayList<Line> array) {
        this.array = array;
        this.d = new TreeMap();
        for (int i = 0; i < array.size(); i++) {
            if (d.containsKey(this.array.get(i).getHistory().length)) {
                Pares p = new Pares();
                p = d.get(this.array.get(i).getHistory().length);
                if (p.getLeftValue() < this.array.get(i).getValue()) {
                    p.setRight(this.array.get(i).getElement().element);
                    p.setRightValue(this.array.get(i).getValue());
                } else {
                    p.inverte(this.array.get(i).getElement().element, this.array.get(i).getValue());
                }
                d.put(this.array.get(i).getHistory().length, p);
            } else {
                Pares p = new Pares();
                p.setLeft(this.array.get(i).getElement().element);
                p.setLeftValue(this.array.get(i).getValue());
                d.put(this.array.get(i).getHistory().length, p);
            }
        }
        insert(this.array);
    }

    public boolean insert(ArrayList<Line> array) {
        Node n;
        for(Integer i : d.keySet()){
            if(i == 1){ tree = new BinaryTree(this.d.get(1).getLeft()); n = tree.getRoot(); }
            
            tree
            n.left;
            n.right
        }
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
