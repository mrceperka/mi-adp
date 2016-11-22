/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw03.cmd;

import java.util.TimerTask;

/**
 *
 * @author yadmin
 */
public class PrintCommand extends TimerTask implements Command {

    @Override
    public void execute() {
        System.out.println("Print command execute called");
    }

    @Override
    public void run() {
        execute();
    }
    
    
    
    
    
}
