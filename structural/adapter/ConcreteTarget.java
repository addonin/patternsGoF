/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.adapter;

/**
 *
 * @author dimon
 */
public class ConcreteTarget implements ITarget {

    @Override
    public void request() {
        System.out.println("Concrete target instance process request");
    }
    
}
