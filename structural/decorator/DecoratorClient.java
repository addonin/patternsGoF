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
public class DecoratorClient {
    
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        component.doOperation();
        ConcreteDecorator decorator = new ConcreteDecorator(component);
        decorator.doOperation();
        decorator.newOperation();
    }
    
}
