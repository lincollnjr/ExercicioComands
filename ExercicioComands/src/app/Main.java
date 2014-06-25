/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import commands.CarOff;
import commands.CarOn;
import commands.ClickRecognizer;
import commands.GateClose;
import commands.GateOpen;

/**
 *
 * @author Lincoln
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClickRecognizer clicker = new ClickRecognizer();
        clicker.setCommand(new CarOn(), new CarOff());
        clicker.oneClick();
        clicker.thwoClick();
        clicker.setCommand(new GateOpen(), new GateClose());
        clicker.oneClick();
        clicker.thwoClick();
    }
    
}
