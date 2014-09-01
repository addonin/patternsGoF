/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.decorator;

/**
 *
 * @author dimon
 */
public class ConcreteComponent implements IComponent {

    @Override
    public void doOperation() {
        System.out.println("ConcreteComponent do operation");
    }
    
}
