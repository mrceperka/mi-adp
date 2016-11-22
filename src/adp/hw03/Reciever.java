/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adp.hw03;

import adp.hw03.cmd.CheckWebpageCommand;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yadmin
 */
public class Reciever {
    public void getPageOne() {
        System.out.println(getWebpage("http://www.fit.cvut.cz"));
    }
    
    public void getPageTwo() {
        System.out.println(getWebpage("http://www.google.com"));
    }
    
    private String getWebpage(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) (new URL(url)).openConnection();
            connection.setRequestMethod("GET");
            return new String(url + ": " + connection.getResponseCode());
        } catch (IOException ex) {
            Logger.getLogger(CheckWebpageCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
}
