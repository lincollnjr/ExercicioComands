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
public class ClickRecognizer {
    
    private Command commandOne, commandThwo;
    
    public void setCommand(Command commandOne, Command commandThwo){
        this.commandOne = commandOne;
        this.commandThwo = commandThwo;
    }
    
    public void oneClick(){
        commandOne.execute();
    }
    
    public void thwoClick(){
        commandThwo.execute();
    }
}
