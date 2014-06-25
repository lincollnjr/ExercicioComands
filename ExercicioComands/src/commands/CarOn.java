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
public class CarOn implements Command {

    @Override
    public void execute() {
        
        Car car = new Car();
        car.onCar();
        
    }
    
}
