/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw03;

import adp.hw02.proxy.Proxy;
import adp.hw03.cmd.CheckWebpageCommand;
import adp.hw03.cmd.CheckWebpageCommand2;
import adp.hw03.cmd.Command;
import adp.hw03.cmd.PrintCommand;
import static java.lang.Thread.sleep;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yadmin
 */
public class Main {
    public static void main(String[] args){
        Timer t = new Timer();
        TimerTask c1 = new PrintCommand();
        TimerTask c2 = new PrintCommand();
        t.addCommand(c1, 1000L);
        t.addCommand(c2, 1000L);
        t.addCommand(new CheckWebpageCommand(), 2500L);
        t.addCommand(new CheckWebpageCommand2(), 500L);
        System.out.println(t.listCommands());
        
        t.removeCommand(c1);
        System.out.println(t.listCommands());
        
        t.start();
        Thread myThread = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                    t.stop();
                   
                } catch (InterruptedException ex) {
                    Logger.getLogger(Proxy.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        myThread.start();
    }
}
