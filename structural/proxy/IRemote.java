/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author dimon
 */
public interface IRemote extends Remote {
    
    public String testMethod() throws RemoteException;
    
}
