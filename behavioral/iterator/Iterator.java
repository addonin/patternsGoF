/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package behavioral.iterator;

/**
 *
 * @author dimon
 * @param <Item>
 */
public interface Iterator<Item> {
    
    boolean hasNext();
    Item next();
    
}
