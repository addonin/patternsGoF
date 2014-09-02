/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.factoryMethod;

/**
 *
 * @author dimon
 */
public class ConcreteCreatorB extends AbstractCreator {

    @Override
    public IProduct factoryMethod() {
        return new ConcreteProductB();
    }
    
}
