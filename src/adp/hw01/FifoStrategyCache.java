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
public class FifoStrategyCache implements CacheStrategyInterface<AbstractKey, ValueInterface> {

    private final CacheMap<String, ValueInterface> cache;
    private int maxSize;

    public FifoStrategyCache(int maxSize) {
        this.cache = new FifoCacheMap<>(maxSize);
    }

    //podle me by tohle mohlo by v abstractnim predkovi
    //ocp se pise "According to the strategy pattern, the behaviors of a class should not be inherited."
    //my ale zadny dalsi behavior nepridavame, jen bychom implementovali ten uplne puvodni interface
    //ty podtridy by extendovali abstractni strategy a dalsi behavior by se jim pridal tak
    //ze by implementovali jeste jiny, dalsi interface
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
