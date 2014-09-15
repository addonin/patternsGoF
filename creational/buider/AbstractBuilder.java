/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.buider;

/**
 *
 * @author dimon
 */
public abstract class AbstractBuilder {
    
    protected Product product;
    
    public Product getProduct() {
        return this.product;
    }
    
    public void createNewProduct() {
        this.product = new Product();
    }
    
    public abstract void buildElement1();
    public abstract void buildElement2();
    
}
