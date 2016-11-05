/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01.value;

/**
 *
 * @author yadmin
 */
public class AbstractValue<T> implements ValueInterface<T> {
    private final T value;
    
    public AbstractValue(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return this.value;
    }
    
}
