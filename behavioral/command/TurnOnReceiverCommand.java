/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package behavioral.command;

/**
 *
 * @author dimon
 */
public class TurnOnReceiverCommand implements ICommand {

    private Receiver receiver;
    
    public TurnOnReceiverCommand(Receiver receiver) {
        this.receiver = receiver;
    }    
    
    @Override
    public void execute() {
        receiver.on();
    }
    
}
