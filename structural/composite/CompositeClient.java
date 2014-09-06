/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.composite;

/**
 *
 * @author dimon
 */
public class CompositeClient {    
    
    public static void main(String[] args) {
        
        Composite root = new Composite("root");
        root.add(new Leaf("1, 1 level"));
        root.add(new Leaf("2, 1 level"));
        Composite composite1 = new Composite("1, 1 level");
        composite1.add(new Leaf("1, 2 level"));
        root.add(composite1);
        root.print();
        
        
    }
    
    
}
