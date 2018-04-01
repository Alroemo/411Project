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
    
    public Sentence(){  }
    
    public Sentence(String _blankSentence, String _completeSentence){
        blankSentence = _blankSentence;
        completeSentence = _completeSentence;
    }
    
    //converts "the _ went to the store" to "the man went to the store"
    public String convertSentence(){
        String sentencePart1, sentencePart2;
        sentencePart1 = blankSentence.substring(0, blankSentence.indexOf("_") - 1);
        sentencePart2 = blankSentence.substring(blankSentence.indexOf("_") + 1);
        completeSentence = sentencePart1 + inputWord + sentencePart2;
        return completeSentence;
    }
}
