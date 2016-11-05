/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01.key;

public abstract class KeyInterface<T> implements Comparable<T> {
    
    public abstract String getHash();
    public abstract T getKey();

    
}
