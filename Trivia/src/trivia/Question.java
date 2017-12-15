package trivia;




public class Question {
    
    private String question;
    private String possibleAnswer1;
    private String possibleAnswer2;
    private String possibleAnswer3;
    private String possibleAnswer4;
    private int correct;
    private Integer id;
    
    public Question(Integer id, String question, String possibleAnswer1, String possibleAnswer2,String possibleAnswer3, String possibleAnswer4, int correct)
    {
        
        this.question=question;
        this.possibleAnswer1=possibleAnswer1;
        this.possibleAnswer2=possibleAnswer2;
        this.possibleAnswer3=possibleAnswer3;
        this.possibleAnswer4=possibleAnswer4;
        this.correct=correct;
        this.id=id;
    }
    
    
    public String getQuestion() {
        return question;
    }
    
    public void setQuestion(String question){
        this.question=question;
    }
   
    public String getPossibleAnswer1() {
        return possibleAnswer1;
    }

    
    public void setPossibleAnswer1(String possibleAnswer1) {
        this.possibleAnswer1 = possibleAnswer1;
    }

    
    public String getPossibleAnswer2() {
        return possibleAnswer2;
    }

    
    public void setPossibleAnswer2(String possibleAnswer2) {
        this.possibleAnswer2 = possibleAnswer2;
    }

    
    public String getPossibleAnswer3() {
        return possibleAnswer3;
    }

    
    public void setPossibleAnswer3(String possibleAnswer3) {
        this.possibleAnswer3 = possibleAnswer3;
    }

    
    public String getPossibleAnswer4() {
        return possibleAnswer4;
    }

   
    public void setPossibleAnswer4(String possibleAnswer4) {
        this.possibleAnswer4 = possibleAnswer4;
    }

   
    public int getAnswer() {
        return correct;
    }

    
    public void setAnswer(int correct) {
        this.correct = correct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    
    
    
}
