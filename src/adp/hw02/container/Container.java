/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw02.container;
import adp.hw02.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yadmin
 */
public class Container implements SubjectInterface, ClonableListInterface {
    private final List<String> list = new ArrayList<>();

    @Override
    public List create(String item) {
         list.add(item);
         return list;
    }

    @Override
    public String read(Integer key) {
        return list.get(key);
    }

    @Override
    public List update(Integer key, String value) {
        list.set(key, value);
        return list;
    }

    @Override
    public List delete(Integer key) {
       list.remove((int) key);
       return list;
    }
    
    @Override
    public List cloneList() {
        List<String> clone = new ArrayList<>(list.size());
        list.forEach((item) -> {
            clone.add(new String(item));
        });
        return clone;
    }

    @Override
    public List getList() {
        return list;
    }
    
    
    
    
}
