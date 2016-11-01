/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw01.key;

public interface KeyInterface<T>
{
    public String getHash();
    public T getKey();
}
