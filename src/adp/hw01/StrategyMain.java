/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01;
import adp.hw01.key.*;
import adp.hw01.value.*;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author benesjo6
 */
public class StrategyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is LRU!");
        LruStrategyCache lruStrategy = new LruStrategyCache(3);
        Cache<AbstractKey, AbstractValue> c1 = new Cache(lruStrategy);
        
        c1.add(new StringKey("1"), new StringValue("here is one"));
        c1.add(new IntegerKey(2), new IntegerValue(2));
        c1.add(new IntegerKey(3), new IntegerValue(3));
        c1.get(new StringKey("1")); //1 used again => 2 will be missing
        c1.add(new StringKey("4"), new StringValue("here is four"));
        
        System.out.println(c1.get(new StringKey("1")).getValue());
        System.out.println("missing: " + c1.get(new IntegerKey(2)));
        System.out.println(c1.get(new IntegerKey(3)).getValue());
        System.out.println(c1.get(new StringKey("4")).getValue());

        
        
        System.out.println();
        System.out.println("This is FIFO!");
        FifoStrategyCache fifoStrategy = new FifoStrategyCache(3); 
        Cache<AbstractKey, AbstractValue> c2 = new Cache(fifoStrategy);
        
        c2.add(new StringKey("1"), new StringValue("here is one"));
        c2.add(new IntegerKey(2), new IntegerValue(2));
        c2.add(new IntegerKey(3), new IntegerValue(3));
        c2.get(new StringKey("1")); //does not care, this is FIFO
        c2.add(new StringKey("4"), new StringValue("here is four"));
        c2.add(new StringKey("4"), new StringValue("here was four")); //overwriting works
        
        System.out.println("missing: " + c2.get(new StringKey("1"))); //will be missing
        System.out.println(c2.get(new IntegerKey(2)).getValue());
        System.out.println(c2.get(new IntegerKey(3)).getValue());
        System.out.println(c2.get(new StringKey("4")).getValue());

        
        
        System.out.println();
        System.out.println("Compare keys!");
        System.out.println("\"1\" == 1 " + (new StringKey("1")).compareTo(new IntegerKey(1)));
        System.out.println("\"1\" == 2 " + (new StringKey("1")).compareTo(new IntegerKey(2)));
        System.out.println("\"03\" == 3 " + (new StringKey("03")).compareTo(new IntegerKey(3)));
    }
    
}
