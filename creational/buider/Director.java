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
public class Director {

    AbstractBuilder builder;
    
    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    } 
    
    public Product getProduct() {
        return builder.getProduct();
    }
    
    public void constructProduct() {
        builder.createNewProduct();
        builder.buildElement1();
        builder.buildElement2();
    }
    
}
