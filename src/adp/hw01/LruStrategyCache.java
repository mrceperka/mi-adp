/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01;

import java.util.Map;

/**
 *
 * @author benesjo6
 */
public class LruStrategyCache<K, V> implements CacheStrategyInterface<K, V> {
    
    private Map<K, V> cache; 

    public LruStrategyCache(int maxSize) {
    }

    public LruStrategyCache(Map<K, V> cache) {
        this.cache = cache;
    }

    @Override
    public void addItem(K key, V value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public V getItem(K key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cleanup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
