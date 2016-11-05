/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01.key;

public abstract class AbstractKey<T> implements Comparable<AbstractKey>, KeyInterface {
    private final T key;
    
    public AbstractKey(T key){
        this.key = key;
    }
    
    public T getKey() {
        return this.key;
    }

    @Override
    public int compareTo(AbstractKey ak) {
        return this.getHash().compareTo(ak.getHash());
    }
    
    
}
