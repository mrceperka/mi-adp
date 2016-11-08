/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw02;

import adp.hw02.proxy.Proxy;
import adp.hw02.container.Container;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yadmin
 */
public class Main {
    public static void main(String [] args)
    {
        Container c = new Container();
        Proxy p = new Proxy(c);
        p.create("1");
        p.read(0);
        p.create("2");
        p.delete(0);

        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Proxy.class.getName()).log(Level.SEVERE, null, ex);
                }
                p.create("3");
                System.out.println(p.getList());
            }
        };
        t.start();
    }
}
