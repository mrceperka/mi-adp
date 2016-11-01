/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01.key;

public class IntegerKey implements KeyInterface {
    private final Integer key;
    
    public IntegerKey(Integer key) {
        this.key = key;
    }
    
    @Override
    public String getHash() {
        return key.toString();
    }
    
    @Override
    public Integer getKey() {
        return this.key;
    }
}
