/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw03.cmd;

import adp.hw03.Reciever;
import java.util.TimerTask;

/**
 *
 * @author yadmin
 */
public class CheckWebpageCommand extends TimerTask implements Command{
    private Reciever r = new Reciever();
    @Override
    public void execute() {
        r.getPageOne();
    }

    @Override
    public void run() {
        execute();
    }
}
