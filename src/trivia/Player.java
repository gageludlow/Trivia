package trivia;
import java.util.ArrayList;

public class Player {

    private Integer id;
    private String name;
    //private String[] questionsAsked;
    //private Question[] questionsAsked;
    private ArrayList<Question> questionsAsked;
    

    public Player(Integer id, String name){

        this.id = id;
        this.name = name;
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

    


    public ArrayList<Question> getQuestionsAsked(){
        return questionsAsked;
    }

    public void addQuestionAsked(Question q)
    {
        questionsAsked.add(q);
    }

    public void setQuestionsAsked(){
        this.questionsAsked = questionsAsked;
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

    public Integer calculateScore(Player player){
        
        Integer score=0;
        
        return score;
    };

    
}