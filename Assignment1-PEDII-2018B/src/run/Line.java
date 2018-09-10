package run;

import apoio.Node;

/* @author anderson.caye */
public class Line {
    private String [] history;
    private Node element;
    private int value;

    public Line(String[] history, Node element, int value) {
        this.history = history;
        this.element = element;
        this.value = value;
    }

    public Line(String[] history) {
        this.history = history;
        String e = this.history[this.history.length-1];
        e = e.substring(e.indexOf("[")+1, e.indexOf("]")-1);
        
        this.value = Integer.parseInt( e );
        this.element = new Node(e);
    }   
    
    public String[] getHistory() {
        return history;
    }

    public void setHistory(String[] history) {
        this.history = history;
    }

    public Node getElement() {
        return element;
    }

    public void setElement(Node element) {
        this.element = element;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
