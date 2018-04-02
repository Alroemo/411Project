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

    public FormView() {
        html = "";
    }

    public String getView(Sentence sentence) {
        html = "<html>"
                + "<body>"
                + "<form>"
                + sentence.sentencePart1 + "<input type='text' name='entry'>" + sentence.sentencePart2+"<br>"
                + "<input type='submit' name='submit'><br>"
                +"</form>"
                + "</body>"
                + "</html>";
        return html;
    }
}
