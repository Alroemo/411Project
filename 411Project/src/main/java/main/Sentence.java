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
public class Sentence {
    String blankSentence;
    String inputWord;
    String completeSentence;
    String sentencePart1, sentencePart2;
    
    public Sentence(){  }
    
    public Sentence(String _blankSentence){
        blankSentence = _blankSentence;
        sentencePart1 = blankSentence.substring(0, blankSentence.indexOf("_") - 1);
        sentencePart2 = blankSentence.substring(blankSentence.indexOf("_") + 1);
    }
    
    
    
    //converts "the _ went to the store" to "the man went to the store"
    public String convertSentence(String inputWord){
        completeSentence = sentencePart1 + inputWord + sentencePart2;
        return completeSentence;
    }
}
