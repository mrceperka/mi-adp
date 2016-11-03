/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author benesjo6
 */
public abstract class CacheMap<K, V> {

    protected Map<K, V> cache;
    protected int maxSize;

    public CacheMap(int maxSize) {
        this.maxSize = maxSize;
    }

    protected <K, V> Map<K, V> createLruOrFifoMap(int maxSize, boolean lru) {
        return new LinkedHashMap<K, V>(maxSize, 1.0f, lru) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > maxSize;
            }
        };

    }

    public Map<K, V> getCache() {
        return cache;
    }
}
