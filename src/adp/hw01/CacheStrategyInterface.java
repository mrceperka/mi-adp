/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01;

/**
 *
 * @author benesjo6
 * @param <K> - cache key data type
 * @param <V> - cache value data type
 */
public interface CacheStrategyInterface<K, V> {
    
    public void addItem(K key, V value);
    
    public V getItem(K key);
    
    public int size();
    
    public void cleanup();
}
