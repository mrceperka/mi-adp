/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01.key;

public class StringKey implements KeyInterface {
    private final String key;
    
    public StringKey(String key) {
        this.key = key;
    }
    
    @Override
    public String getHash() {
        return key;
    }
    
    @Override
    public String getKey() {
        return this.key;
    }
}
