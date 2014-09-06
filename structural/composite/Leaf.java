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
public class Leaf implements Component {
    
    String name;

    public Leaf(String name) {
        this.name = name;
    }    

    @Override
    public void print() {
        System.out.println("I'm leaf " + this.name);
    }
    
}
