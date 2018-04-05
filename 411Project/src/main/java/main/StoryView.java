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
public class StoryView {
    String html;
    public StoryView(){
        html = "<html>"
                +"<body>"
                + "</body>"
                +"</html>";
    }
    public StoryView(Story story){
        html = "<html>"
                +"<body>"
                +"<p>"+story.makeStory()+"</p>"
                + "</body>"
                +"</html>";
    }
    
    public String getView(Story story){
        html = "<html>"
                +"<body>"
                +"<p>"+story.makeStory()+"</p>"
                + "</body>"
                +"</html>";
        return html;
    }
}
