
package trivia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Trivia {

  
    public static void main(String[] args) {
        
        //CSV Files****
        String filepath = "PlayerCSV.txt";
        String filePath = "Questions.csv";
        
        Scanner input = new Scanner(System.in);
        
        final int NUM_OF_QUESTIONS=10;
        
        ArrayList<Player> Players = new ArrayList<Player>();
        
        int playerOneScore=0;
        int playerTwoScore=0;
        
        Question[] triviaQuestion = new Question[NUM_OF_QUESTIONS];
        boolean leaveInnerLoop = true;
        boolean leaveOuterLoop = true;
        boolean leaveSaveLoop = true;
        boolean leavePlayAgainLoop = true;
        boolean playerDataSaved = false;
        String searchTerm = "";

        //Menu
       
         System.out.println("*** Menu ***");
         System.out.println("1)  New Game");
         System.out.println("2)  Exit");
     
        int menuChoice= input.nextInt(); // User Menu Input
        
        do{
            switch (menuChoice){
                case 1:
                        //Ask Player for theme*****************************************************************************************************
                        do{
                            System.out.println("What theme of trivia would you like to play?");
                            System.out.println("1) Programming");
                            System.out.println("2) U.S.A");
                            System.out.println("3) Anime");
                            System.out.println("4) Science");
                            System.out.println("5) Star Wars");
                            int themeChoice = input.nextInt();

                            switch (themeChoice) {
                                case 1:
                                    searchTerm = "programming";
                                    break;
                                case 2:
                                    searchTerm = "usa";
                                    break;
                                case 3:
                                    searchTerm = "anime";
                                    break;
                                case 4:
                                    searchTerm = "science";
                                    break;
                                case 5:
                                    searchTerm = "starwars";
                                    break;
                                default:
                                    leaveInnerLoop = false;
                                    System.out.println("Error! Enter a valid theme please. \n\n");
                                    break;
                            }
                        }while(leaveInnerLoop == false);

                    LoadQuestionCSV.readCSV(searchTerm,filePath,triviaQuestion,NUM_OF_QUESTIONS);        

                    //Player 1 & 2 creation *****************************************************************************************************
                    if(playerDataSaved == false){
                        for(int p=0; p<2; p++){
                        System.out.println("Enter Player " + (p + 1) + " Name: ");
                        String userName = input.next();
                        int userID = p;
                        int score = 0;

                        Player player = new Player(userID, userName, score);
                        Players.add(player);
                        }
                    }
                    
                    //Player Turns*****************************************************************************************************
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
                    //Display output*****************************************************************************************************
                    System.out.println(Players.get(0).getName() + " Scored " +Players.get(0).getScore() + " Points!");
                    System.out.println(Players.get(1).getName() + " Scored " +Players.get(1).getScore() + " Points!");

                    if(Players.get(0).getScore() == Players.get(1).getScore()){
                        System.out.println("It's a Tie!!!");
                    }else if(Players.get(0).getScore() > Players.get(1).getScore()){
                        System.out.println(Players.get(0).getName() + " Wins!");
                    }else{
                        System.out.println(Players.get(1).getName() + " Wins!");
                    }

                    //Save Player file*****************************************************************************************************
                    do{
                        System.out.println("\n\nWould you like to save player scores?");
                        System.out.println("1) Yes");
                        System.out.println("2) No");

                    int saveAnswer = input.nextInt();

                    switch(saveAnswer){
                        case 1:
                            WriteToCSV.savePlayerInfo(0,Players.get(0).getName(),Players.get(0).getScore(), filepath);
                            WriteToCSV.savePlayerInfo(1,Players.get(1).getName(),Players.get(1).getScore(), filepath);
                            do{
                                System.out.println("\n\nWould you like to play again?"); // Play again*************************************************
                                System.out.println("1) Yes");
                                System.out.println("2) No");
                                int playAgainAnswer = input.nextInt();

                                switch(playAgainAnswer){
                                    case 1: // Yes
                                        leaveOuterLoop = false;
                                        playerDataSaved = true;
                                        break;
                                    case 2: // No
                                        leaveOuterLoop = true;
                                        break;
                                    default:
                                        leavePlayAgainLoop = false;
                                        System.out.println("Error! Enter a valid save option please. \n\n");
                                        break;
                                }
                            }while(leavePlayAgainLoop == false);
                            break;
                        case 2: 
                            WriteToCSV.deletePlayerFile(filePath);
                            break;
                        default:
                            leaveSaveLoop = false;
                            System.out.println("Error! Enter a valid save option please. \n\n");
                            break;          
                        }
                    }while(leaveSaveLoop == false);
                    break;

                case 2: //Menu Exit game
                    System.exit(0);
                    break;
                default:
                    leaveOuterLoop = false;
                    System.out.println("Error! Enter a valid menu choice please. \n\n");
                    break;
            }
        }while(leaveOuterLoop == false);
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