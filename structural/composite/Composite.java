/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.composite;

import java.util.ArrayList;

/**
 *
 * @author dimon
 */
public class Composite implements Component {
    
    String name;
    ArrayList<Component> elements;

    public Composite(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
        
    @Override
    public void print() {
        System.out.println("I'm composite " + name);
        for (Component c : elements) {
            c.print();
        }
    }
    
    public void add(Component c) {
        this.elements.add(c);
    }
    
    public void remove(Component c) {
        this.elements.remove(c);
    }
    
    public Component getElement(int i) {
        return this.elements.get(i);
    } 
    
}
