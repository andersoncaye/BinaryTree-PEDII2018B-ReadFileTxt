package run;

import apoio.*;
import gema.Arquivo;
import java.util.ArrayList;

/* @author anderson.caye */

public class Principal {
    
    public static void main(String[] args) {
        Arquivo file = new Arquivo("dataset-b-small.txt");
        ArrayList<Line> array = new ArrayList();
        if( file.abrirLeitura() ){
            String lin = file.lerLinha();
            do{
                array.add(new Line( lin.split(" : ") ));                
                lin = file.lerLinha();
            } while (lin != null);
        }
        
        BinarySearchTree bst = new BinarySearchTree(array);
        
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getElement().element);
        }
        
        System.out.println("\n\n");
        TreeVisualization.svg_start();
        
        TreeVisualization.svg(bst.getTree().getRoot(), 400, 30, 200);
        
        TreeVisualization.svg_finish();
    }
    
}
