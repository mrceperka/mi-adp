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
public class LruCacheMap<K, V> extends CacheMap<K, V> {

    public LruCacheMap(int maxSize) {
        super(maxSize);
        this.cache = createLruOrFifoMap(maxSize, true);
    }
    
    public LruCacheMap(CacheMap cache) {
        super(cache.maxSize);
        this.cache = createLruOrFifoMap(maxSize, true);
        this.cache.putAll(cache.cache);
    }
    
}
