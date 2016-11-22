/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw03;

import adp.hw03.cmd.Command;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimerTask;

/**
 *
 * @author yadmin
 */
public class Timer {
    private final HashMap<Long, List<TimerTask>> commands = new HashMap<>();
    private java.util.Timer time = new java.util.Timer();
    
    public void addCommand(TimerTask c, long period) {
        List<TimerTask> l = commands.get(period);
        if(l == null) {
              l = new ArrayList<>();
        }
        l.add(c);
        commands.put(period, l);
    }
     
    public void removeCommand(TimerTask c) {
        for(List<TimerTask> l: commands.values()) {
            l.remove(c);
        }
    }

    public HashMap<Long, List<TimerTask>> listCommands() {
        return commands;
    }
    
    public void start()
    {
        for(long period: commands.keySet()) {
            List<TimerTask> l = commands.get(period);
            for(TimerTask tt: l) {
                time.schedule(tt, new Date(), period);
            }     
        }
    }
    
    public void stop()
    {
        time.cancel();
        time.purge();
    }
}
