package trivia;
import java.util.ArrayList;
import java.util.Random;

public class Player {

    private Integer id;
    private String name;
    private int score;

    //private String[] questionsAsked;
    //private Question[] questionsAsked;
    private ArrayList<Question> questionsAsked;
    

    public Player(Integer id, String name, int score){

        this.id = id;
        this.name = name;
        this.score = score;
        this.questionsAsked = new ArrayList<Question>(10);  //10 capactity initially

    }

    public Integer getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Question> getQuestionsAsked(){
        return questionsAsked;
    }

    public void setQuestionsAsked(){
        this.questionsAsked = questionsAsked;
    }
    
    
    
    public void addQuestionAsked(Question q)
    {
        questionsAsked.add(q);
    }

    public boolean hasQuestionBeenAsked(Question q)
    {
        for(Question qu : questionsAsked)
        {
            if(qu.getId() == q.getId())
                return true;
        }
        return false;
        
        // if(questionsAsked.Contains(q))
        // {
        //     return true;
        // }
        // else
        // {
        // return false;
        // }

        

    }
    
    
    /*
    public Integer calculateScore(Player player){
        
        Integer score=0;
        
        return score;
    };
    */

    
}