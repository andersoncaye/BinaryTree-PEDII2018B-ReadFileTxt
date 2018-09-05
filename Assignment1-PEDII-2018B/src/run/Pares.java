/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

/**
 *
 * @author anderson.caye
 */
public class Pares {
    private String left;
    private int leftValue;
    private String right;
    private int rightValue;

    public Pares(String left, int leftValue, String right, int rightValue) {
        this.left = left;
        this.leftValue = leftValue;
        this.right = right;
        this.rightValue = rightValue;
    }
    
    public Pares() {
        
    }

    public void inverte(String newLeft, int newLeftValue){
        this.right = this.left;
        this.rightValue = this.leftValue;
        this.left = newLeft;
        this.leftValue = newLeftValue;
    }
        
    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public int getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(int leftValue) {
        this.leftValue = leftValue;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }
    
    public int getRightValue() {
        return rightValue;
    }

    public void setRightValue(int rightValue) {
        this.rightValue = rightValue;
    }
}
