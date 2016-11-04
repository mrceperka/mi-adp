/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01;


/**
 *
 * @author benesjo6
 * @param <V> - cache value data type
 */
public class FifoStrategyCache<K, V> implements CacheStrategyInterface<K, V> {

    private final CacheMap<K, V> cache;
    private int maxSize;

    public FifoStrategyCache(int maxSize) {
        this.cache = new FifoCacheMap<>(maxSize);
    }

    @Override
    public void addItem(K key, V value) {
        cache.getCache().put(key, value);
    }

    @Override
    public V getItem(K key) {
        return cache.getCache().get(key);
    }

    @Override
    public int size() {
        return cache.getCache().size();
    }

    @Override
    public void cleanup() {
        cache.getCache().clear();
    }


}
