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
public class FifoCacheMap<K, V> extends CacheMap<K, V> {

    public FifoCacheMap(int maxSize) {
        super(maxSize);
        this.cache = createLruOrFifoMap(maxSize, false);

    }

    public FifoCacheMap(CacheMap<K, V> cache) {
        super(cache.maxSize);
        this.cache = createLruOrFifoMap(maxSize, false);
        this.cache.putAll(cache.cache);
    }

}
