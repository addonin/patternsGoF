/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.facade;

/**
 *
 * @author dimon
 */
public class FacadeAB {
    
    private ClassA instanceA;
    private ClassB instanceB;

    public FacadeAB(ClassA instanceA, ClassB instanceB) {
        this.instanceA = instanceA;
        this.instanceB = instanceB;
    }
    
    public void facadeOperation() {
        instanceA.doOperation();
        instanceB.doOperation();
    }
}
