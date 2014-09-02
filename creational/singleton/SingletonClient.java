/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.singleton;

/**
 *
 * @author dimon
 */
public class SingletonClient {
    
    public static void main(String[] args) {
        
        System.out.println(Singleton.getInstance());
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Singleton.getInstance());
            }
            
        }).start();
        
    }
    
}
