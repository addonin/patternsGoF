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
public class ConcreteDecorator extends AbstractDecorator {

    public ConcreteDecorator(IComponent component) {
        super(component);
    }
    
    @Override
    public void doOperation() {
        System.out.println("doOperation() overriden functionality");
    }

    @Override
    public void newOperation() {
        System.out.println("new functionality of decorator");
    }
    
}
