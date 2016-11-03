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
    
    private final CacheStrategyInterface<K, V> cache;

    public Cache(CacheStrategyInterface<K, V> cache) {
        this.cache = cache;
    }

    public void add(K key, V value) {
        this.cache.addItem(key, value);
    }
    
    public V get(K key) {
        return this.cache.getItem(key);
    }
    
    public int size() {
        return this.cache.size();
    }
    
    public void cleanup() {
        this.cache.cleanup();
    }
    
}
