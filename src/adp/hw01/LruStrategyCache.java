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
public class LruStrategyCache<K, V> extends AbstractStrategy<K, V> {

    public LruStrategyCache(int maxSize) {
        this.maxSize = maxSize;
    }

    public LruStrategyCache(Map<K, V> cache) {
        this.cache = cache;
    }

    @Override
    public V getItem(K key) {
        //TODO
        return this.cache.get(key);
    }    
}
