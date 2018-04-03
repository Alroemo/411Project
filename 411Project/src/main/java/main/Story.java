/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.fasterxml.jackson.databind.*;
import java.io.*;
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
    
    public void setSentence(int index, Sentence newSentence){
        sentence.set(index, newSentence);
    }
    
    public String makeStory(){
        String story = "";
            for(int i = 0; i < sentence.size(); i++){
                story += sentence.get(i);
            }
        return story;
    }
//    
//        public String SerlializeJSON() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
//        String result = "";
//        try {
//            result = objectMapper.writeValueAsString(sentence);
//        } catch (JsonProcessingException ex) {
//            System.out.println("Failed serializing JSON");
//        }
//        return result;
//    }
//
//    public static Story ReadJSON(String fileName) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        Story newStory = new Story();
//        objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
//
//        try {
//            File file = new File(fileName);
//            newStory = objectMapper.readValue(file, Story.class);
//        } catch (IOException ex) {
//        }
//        return newStory;
//    }
//
//    public void saveToJSON(String jsonString, String fileName) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        File file = new File(fileName);
//        try {
//            objectMapper.writeValue(file, jsonString);
//        } catch (IOException ex) {
//            System.out.println("Failed to save list to JSON");
//        }
//    }

}
