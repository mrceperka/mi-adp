/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw03.cmd;

import adp.hw03.Reciever;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yadmin
 */
public class CheckWebpageCommand2 extends TimerTask implements Command{
    private Reciever r = new Reciever();
    @Override
    public void execute() {
        r.getPageTwo();
    }

    @Override
    public void run() {
        execute();
    }
}
