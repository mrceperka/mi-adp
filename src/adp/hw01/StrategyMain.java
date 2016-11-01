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
        // TODO code application logic here
        Map <KeyInterface, ValueInterface> map = new HashMap<>();
        LruStrategyCache lru = new LruStrategyCache(map);
        
        Cache c = new Cache(lru);
        StringKey k1 = new StringKey("1");
        IntegerKey k2 = new IntegerKey(15);
        c.add(k1, new StringValue("here is one"));
        c.add(k2, new IntegerValue(15));
        
        System.out.println(c.get(k1));
        System.out.println(c.get(k2));
        
    }
    
}
