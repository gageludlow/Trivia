package trivia;

public class Player {

    private Integer id;
    private String name;
    private Integer[] questionsAsked;
    

    public Player(Integer id, String name, Integer[] questionsAsked){

        this.id = id;
        this.name = name;
        this.questionsAsked = questionsAsked;

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

    


    public Integer[] getQuestionsAsked(){
        return questionsAsked;
    }

    public void setQuestionsAsked(){
        this.questionsAsked = questionsAsked;
    }

    public Integer calculateScore(Player player){
        
        
        return Integer score;
    };

    
}