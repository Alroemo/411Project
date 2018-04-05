/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.*;
import java.net.*;
import java.text.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Alex
 */
public class HTTPConnection implements Runnable {

    private static ConcurrentHashMap<String, Float> map;
    private Socket clientSocket;

    HTTPConnection(Socket socket) {
        this.clientSocket = socket;
    }

    public static void main(String args[]) {

        System.out.println("Multi-Threaded Server Started");
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            while (true) {
                System.out.println("Listening for a client connection");
                Socket socket = serverSocket.accept();
                System.out.println("Connected to a Client");
                new Thread(new HTTPConnection(socket)).start();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Multi-Threaded Server Terminated");
    }

    public void run() {
        Story story = new Story();
        Sentence newSentence = new Sentence("The _ went to the store");
        story.addSentence(newSentence);
        
        System.out.println("Client Thread Started");
        FormView hview = new FormView();
        try (BufferedReader bis = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintStream out = new PrintStream(clientSocket.getOutputStream())) {
            String inputLine = bis.readLine().toLowerCase();
            
            if ((inputLine.indexOf("get") > -1) && (inputLine.indexOf("/form") > -1)) {
                out.print("HTTP/1.1 200 OK\n\n");
                
                System.out.println(newSentence.sentencePart1 + newSentence.sentencePart2);
                
                if (inputLine.indexOf("submit") > -1) {
                    System.out.println("New sentence completed");
                    //out.print(hview.getView(newSentence));
                    String resultSentence = newSentence.convertSentence(inputLine);
                    
                } else {
                    out.print(hview.getView(newSentence) + "\n");
                }
            }
            else if ((inputLine.indexOf("get") > -1) && (inputLine.indexOf("/story") > -1)) {
                out.print("HTTP/1.1 200 OK\n\n");
                StoryView view = new StoryView();
                out.print(view.getView(story) + "\n");
            }
            clientSocket.close();
            System.out.println("Client Connection Terminated");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Client Thread Terminated");
    }
}
