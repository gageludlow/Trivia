package trivia;

public class QuestionAsked {

    //verify if the question that was chosen randomly was asked already in a previous game.
    public void QuestionAsked(Player[] currentPlayer, Integer questionID){
        for(int p=0;p<currentPlayer.length;p++){
            
            for (int q=0; q<currentPlayer[p].getQuestionsAsked().size(); q++){
                
                if(currentPlayer[p].getQuestionsAsked().get(q).getId() == questionID){
                    
                }
                

            }
        }
    }

}