package trivia;

public Class Player {

    private Integer id;
    private String name;
    private Integer[] questionsAsked;

    public Player(Integer id, String name, Integer score, Integer[] questionsAsked){

        this.id = id;
        this.name = name;
        this.score = score;
        this.questionsAsked = questionsAsked;

    }

    public Integer getId(){
        return id;
    }

    public Integer setId(){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String setName(){
        this.name = name;
    }

    public Integer getScore(){
        return score;
    }

    public Integer setScore(){
        this.score = score;
    }

    public Integer getQuestionsAsked(){
        return questionsAsked;
    }

    public Integer setQuestionsAsked(){
        this.questionsAsked = questionsAsked;
    }

    public Integer calculateScore(){
        return Integer;
    }

    
}