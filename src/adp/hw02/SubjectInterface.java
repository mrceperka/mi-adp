/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw02;
import java.util.List;
/**
 *
 * @author yadmin
 */
public interface SubjectInterface {
    
    public List create(String value);
    public String read(Integer key);
    public List update(Integer key, String value);
    public List delete(Integer key);
    
    public List getList();
}
