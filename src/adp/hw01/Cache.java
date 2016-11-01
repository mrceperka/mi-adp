/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01;

/**
 *
 * @author benesjo6
 */
public class Cache<K, V> {
    private CacheStrategyInterface<K, V> cache;

    public Cache(CacheStrategyInterface<K, V> cache) {
        this.cache = cache;
    }

    public CacheStrategyInterface<K, V> getCache() {
        return cache;
    }

    public void setCache(CacheStrategyInterface<K, V> cache) {
        this.cache = cache;
    }
    
    public void add(K key, V value) {
        
    }
    
    public V get(K key) {
        
    }
    
    public int size() {
        
    }
    
    public void cleanup() {
        
    }
    
}
