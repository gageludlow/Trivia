
package trivia;

import java.util.Scanner;


public class Trivia {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        final int NUM_OF_QUESTIONS=10;
        
        int playerOneScore=0;
        int playerTwoScore=0;
        
        Question[] triviaQuestion = new Question[NUM_OF_QUESTIONS];
        
        triviaQuestion[0]=new Question(0,"What is my name?","Martin","Monkey","Camel","Happy",1);
        triviaQuestion[1]=new Question(1,"Do you know my name?","Martin","Monkey","Camel","Happy",1);
        triviaQuestion[2]=new Question(2,"How can we dance? ","Martin","Monkey","Camel","Happy",2);
        triviaQuestion[3]=new Question(3,"Who made the duck quack?","Martin","Monkey","Camel","Happy",3);
        triviaQuestion[4]=new Question(4,"Why was I born?","Martin","Monkey","Camel","Happy",3);
        triviaQuestion[5]=new Question(5,"Where was I born?","Moon","Monkey","Camel","Happy",1);
        triviaQuestion[6]=new Question(6,"Who is my worst enemy?","Martin","Monkey","Camel","Happy",2);
        triviaQuestion[7]=new Question(7,"What the biggest Monkey?","Martin","Monkey","Camel","Happy",4);
        triviaQuestion[8]=new Question(8,"Who is my bestfriend?","Martin","Monkey","Gia","Happy",3);
        triviaQuestion[9]=new Question(9,"Who made pizza?","Martin","Monkey","Camel","Happy",4);
        
        Gage,Cars,25,5~1;3~0;4~1,
        
        
        System.out.println("Player 1");
        
        for(int index=0;index<triviaQuestion.length/2;index++)
        {
            System.out.println(triviaQuestion[index].getQuestion());
            System.out.println("1."+triviaQuestion[index].getPossibleAnswer1());
            System.out.println("2."+triviaQuestion[index].getPossibleAnswer2());
            System.out.println("3."+triviaQuestion[index].getPossibleAnswer3());
            System.out.println("4."+triviaQuestion[index].getPossibleAnswer4());
            System.out.println("Enter your answer:");
            
            int useranswer=input.nextInt();
            if(triviaQuestion[index].getAnswer()==useranswer);
            {
                playerOneScore++;
            }
        }
        
          System.out.println("Player 2");
        
        for(int index=triviaQuestion.length/2;index<triviaQuestion.length;index++)
        {
            System.out.println(triviaQuestion[index].getQuestion());
            System.out.println("1."+triviaQuestion[index].getPossibleAnswer1());
            System.out.println("2."+triviaQuestion[index].getPossibleAnswer2());
            System.out.println("3."+triviaQuestion[index].getPossibleAnswer3());
            System.out.println("4."+triviaQuestion[index].getPossibleAnswer4());
            System.out.println("Enter your answer:");
            
            int useranswer=input.nextInt();
            if(triviaQuestion[index].getAnswer()==useranswer);
            {
                playerTwoScore++;
            }
        }
        
        
        if(playerOneScore==playerTwoScore){
            System.out.println("It's a Tie!!!");
        }else if(playerOneScore>playerTwoScore){
            System.out.println("Player 1 WINSSS!!!");
        }else{
            System.out.println("Player 2 WINS!!!!!");
        }
        
        
  
    }
    
}
