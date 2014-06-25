/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commands;

/**
 *
 * @author Lincoln
 */
public class GateClose implements Command{

    @Override
    public void execute() {
        Gate gate = new Gate();
        gate.openGate();
    }
    
}
