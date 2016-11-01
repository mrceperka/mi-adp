/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01;

import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import adp.hw01.key.*;

/**
 *
 * @author benesjo6
 */
public class LruStrategyCache<K, V> extends AbstractStrategy<K, V> {

    public LruStrategyCache(Map<K, V> cache, int maxSize) {
        this.cache = cache;
        this.maxSize = maxSize;
    }
    
    @Override
    public void addItem(K key, V value) {
        if(this.size() < this.maxSize) {
            Set<K> keySet = this.cache.keySet();
            Iterator<K> i = keySet.iterator();
            while(i.hasNext()) {
                K k = i.next();
                System.out.println(k);
            }
            //this.cache.replace(key, value);
            this.cache.put(key, value);
        } else {
            //LRU logic
        }
        
    }
}
