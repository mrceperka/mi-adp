/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw02.proxy;

import adp.hw02.SubjectInterface;
import adp.hw02.container.Container;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yadmin
 */
public class Proxy implements SubjectInterface {
    private final Container subject;
    private boolean lock = false;

    public Proxy(Container subject) {
        this.subject = subject;
    }
    
    @Override
    public List create(String value) {
        if(!lock) {
            subject.create(value);
        } else {
            System.out.println("Can not create " + value + ", locked");
        }
        
        return subject.cloneList();
    }

    @Override
    public String read(Integer key) {
        //lock, unlock
        lock = true;
        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Proxy.class.getName()).log(Level.SEVERE, null, ex);
                }
                lock = false;
            }
        };
        t.start();
        return subject.read(key);
    }

    @Override
    public List update(Integer key, String value) {
        if(!lock) {
            subject.update(key, value);
        } else {
            System.out.println("Can not update " + value + ", locked");
        }
        
        return subject.cloneList();
    }

    @Override
    public List delete(Integer key) { 
        if(!lock) {
            subject.read(key);
        } else {
            System.out.println("Can not delete " + key + ", locked");
        }
        
        return subject.cloneList();
    }
    
    @Override
    public List getList() {
        return subject.getList();
        //return subject.cloneList();
    }
}
