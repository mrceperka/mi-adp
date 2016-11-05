/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01;

import adp.hw01.key.AbstractKey;
import adp.hw01.value.ValueInterface;
/**
 *
 * @author benesjo6
 */
public class LruStrategyCache implements CacheStrategyInterface<AbstractKey, ValueInterface> {

    private final CacheMap<String, ValueInterface> cache;

    public LruStrategyCache(int maxSize) {
        this.cache = new LruCacheMap<>(maxSize);
    }

    @Override
    public void addItem(AbstractKey key, ValueInterface value) {
        cache.getCache().put(key.getHash(), value);
    }

    @Override
    public ValueInterface getItem(AbstractKey key) {
        return cache.getCache().get(key.getHash());
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
