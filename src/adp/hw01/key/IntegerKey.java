/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01.key;

public class IntegerKey extends AbstractKey<Integer> {
    
    public IntegerKey(Integer key) {
        super(key);
    }
    
    @Override
    public String getHash() {
        return this.getKey().toString();
    }
}
