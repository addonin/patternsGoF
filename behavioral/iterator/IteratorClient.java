/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package behavioral.iterator;

/**
 *
 * @author dimon
 */
public class IteratorClient {
    
    public static void main(String[] args) {
        
        StructureImpl s = new StructureImpl(5);
        Iterator iterator = s.createIterator(s);
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
        
    }
    
}
