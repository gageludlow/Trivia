/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Sammy
 */
public class LoadQuestionCSV {
   
    private static Scanner x;
   
   public static void readCSV(String searchTerm, String filePath,Question[] triviaQuestion, final int arraySize){
       boolean found = false;
       String theme;
       int id = 0;
       String question = "";
       String A = "";
       String B = "";
       String C = "";
       String D = "";
       int Answer = 0;
       int i = 0;
       
       try{
           x = new Scanner(new File(filePath));

           while(x.hasNext()){
               x.useDelimiter("[,\n]");
               theme = x.next();
               id = x.nextInt();
               Answer = x.nextInt();
               question = x.next();
               A = x.next();
               B = x.next();
               C = x.next();
               D = x.next();

               
               if(theme.equals(searchTerm)){
                   triviaQuestion[i]=new Question(i,question,A,B,C,D,Answer);
                           i++;
               }
           }
       }catch(Exception e){
           System.out.println("File not imported");
       }    
   } 
}
