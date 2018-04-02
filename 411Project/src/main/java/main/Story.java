/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;

/**
 *
 * @author Alex
 */
public class Story {

    List<Sentence> sentence;

    public Story() {

    }

    public List<Sentence> getSentence() {
        return sentence;
    }

    public void setSentence(List<Sentence> sentence) {
        this.sentence = sentence;
    }
    
    public String makeStory(){
        String story = "";
            for(int i = 0; i < sentence.size(); i++){
                story += sentence.get(i);
            }
        return story;
    }

}
