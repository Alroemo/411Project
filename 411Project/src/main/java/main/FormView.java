/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Alex
 */
public class FormView {
    String html;
    
    public FormView(){
        html = "<html>"
                +"<body>"
                + "<form submit='/submit'>"
                + "<p>The <input type='text' name='word'></input> went to the store</p>"
                + "<input type='submit' name='submit'><br>"
                + "</form>"
                + "</body>"
                +"</html>";
    }
    
    public String getView(){
        html = "<html>"
                +"<body>"
                + "<p>The <input></input> went to the store</p>"
                + "<input type='submit' name='submit'><br>"
                + "</body>"
                +"</html>"; 
        return html;
    }
}
