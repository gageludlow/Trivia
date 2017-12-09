
package trivia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Trivia {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        final int NUM_OF_QUESTIONS=10;
        
        ArrayList<Player> Players = new ArrayList<Player>();
        
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
        
        //Gage,Cars,25,5~1;3~0;4~1,
        for(int p=0; p<2; p++){
            System.out.println("Enter Player " + (p + 1) + " Name: ");
            String userName = input.next();
            int userID = p;
            int score = 0;
            
            Player player = new Player(userID, userName, score);
            Players.add(player);
            
        }
        int playerTurn = 0;
        for (int i=0; i<triviaQuestion.length;i++){
            
            int qID = getRandomQuestion();
            
            while (Players.get(playerTurn).hasQuestionBeenAsked(triviaQuestion[qID])){
                qID = getRandomQuestion();
                //System.out.println("While Loop Ran Random Question chosen");
            }
            
            //if (!Players.get(playerturn).hasQuestionBeenAsked(triviaQuestion[qID])){
                System.out.println(Players.get(playerTurn).getName() + "'s Turn");
                System.out.println(triviaQuestion[qID].getQuestion());
                System.out.println("1."+triviaQuestion[qID].getPossibleAnswer1());
                System.out.println("2."+triviaQuestion[qID].getPossibleAnswer2());
                System.out.println("3."+triviaQuestion[qID].getPossibleAnswer3());
                System.out.println("4."+triviaQuestion[qID].getPossibleAnswer4());
                System.out.println("Enter your answer:");

                int useranswer = input.nextInt();
                System.out.println("\n");
                //add the question to the list of questions that have been asked already for the current player
                Players.get(playerTurn).addQuestionAsked(triviaQuestion[qID]);
                // add 1 to the current players score if they got the question right
                if(triviaQuestion[qID].getAnswer() == useranswer)
                {
                    int playerCurrentScore = Players.get(playerTurn).getScore();
                    playerCurrentScore++;
                    Players.get(playerTurn).setScore(playerCurrentScore);
                }
                //switch player turn
                
                playerTurn ^= 1;
                
                
        }
        System.out.println(Players.get(0).getName() + " Scored " +Players.get(0).getScore() + " Points!");
        System.out.println(Players.get(1).getName() + " Scored " +Players.get(1).getScore() + " Points!");
        
        if(Players.get(0).getScore() == Players.get(1).getScore()){
            System.out.println("It's a Tie!!!");
        }else if(Players.get(0).getScore() > Players.get(1).getScore()){
            System.out.println(Players.get(0).getName() + " Wins!");
        }else{
            System.out.println(Players.get(1).getName() + " Wins!");
        }
        
        
  
    }
    
    public static int getRandomQuestion(){
            Random rand = new Random();
            //10 is the total number of questions in the catagory
            int n = rand.nextInt(10);
            return n;
        }
    
}



/*
        System.out.println("Player 1");
        /*
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
        */
        /*
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
        */