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

    private CacheMap<K, V> cache;
    private int maxSize;

    public FifoStrategyCache(int maxSize) {
        this.cache = new FifoCacheMap<>(maxSize);
    }

    @Override
    public void addItem(K key, V value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public V getItem(K key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cleanup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
