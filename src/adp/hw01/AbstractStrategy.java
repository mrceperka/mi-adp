/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01;

import java.util.Map;

/**
 *
 * @author yadmin
 */
public abstract class AbstractStrategy<K,V> implements CacheStrategyInterface<K, V>{
    protected Map<K, V> cache;
    protected int maxSize;
    
    public int size() {
        return this.cache.size();
    }

    public void cleanup() {
       this.cache.clear();
    }
    
    @Override
    public void addItem(K key, V value) {
        this.cache.put(key, value);
    }
}
