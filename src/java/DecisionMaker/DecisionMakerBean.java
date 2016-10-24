package DecisionMaker;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;


/**
 *
 * @author kris.hayes
 */

@ManagedBean(name="DMBean")
@SessionScoped
public class DecisionMakerBean implements Serializable{
    
    private int questionOneInput = 0;
    private int questionTwoInput = 0;
    private int questionThreeInput = 0;
    private int questionFourInput = 0;
    private int questionFiveInput = 0;
    private int questionSixInput = 0;
    private int questionSevenInput = 0;
    private int questionEightInput = 0;
    private int questionNineInput = 0;
    private int questionTenInput = 0;
    private int questionElevenInput = 0;
    private int questionTwelveInput = 0;
    private int questionThirteenInput = 0;
    private int questionFourteenInput = 0;
    private int questionFifteenInput = 0;
    
    public DecisionMakerBean(){
    }
    
    //Methods to process answers to question and send next html page to display
    public String processOne(){
        if(questionOneInput == 1)
            return "QuestionSeven";
        else if(questionOneInput == 2)
            return "QuestionTwo";
        else
            return "";
    }
    
    public String processTwo(){
        if(questionTwoInput == 1)
            return "QuestionFive";
        else if(questionTwoInput == 2)
            return "QuestionThree";
        else
            return "";
    }
    
    public String processThree(){
        if(questionThreeInput == 1)
            return "QuestionFour";
        else if(questionThreeInput == 2)
            return "SavingsAccount";
        else
            return "";
    }
    
    public String processFour(){
        if(questionFourInput == 1)
            return "Jetski";
        else if(questionFourInput == 2)
            return "Nintendo64";
        else
            return "";
    }
    
    public String processFive(){
        if(questionFiveInput == 1)
            return "MotivationalPicture";
        else if(questionFiveInput == 2)
            return "QuestionSix";
        else
            return "";
    }
    
    public String processSix(){
        if(questionSixInput == 1)
            return "OfficeChair";
        else if(questionSixInput == 2)
            return "CandyBowl";
        else
            return "";
    }
    
    public String processSeven(){
        if(questionSevenInput == 1)
            return "QuestionEight";
        else if(questionSevenInput == 2)
            return "FlowerPot";
        else
            return "";
    }
    
    public String processEight(){
        if(questionEightInput == 1)
            return "PotSet";
        else if(questionEightInput == 2)
            return "QuestionNine";
        else
            return "";
    }
    
    public String processNine(){
        if(questionNineInput == 1)
            return "QuestionTen";
        else if(questionNineInput == 2)
            return "QuestionEleven";
        else
            return "";
    }
    
    public String processTen(){
        if(questionTenInput == 1)
            return "AlarmClock";
        else if(questionTenInput == 2)
            return "Comforter";
        else
            return "";
    }
    
    public String processEleven(){
        if(questionElevenInput == 1)
            return "Printer";
        else if(questionElevenInput == 2)
            return "QuestionTwelve";
        else
            return "";
    }
    
    public String processTwelve(){
        if(questionTwelveInput == 1)
            return "QuestionThirteen";
        else if(questionTwelveInput == 2)
            return "QuestionFourteen";
        else
            return "";
    }
    
    public String processThirteen(){
        if(questionThirteenInput == 1)
            return "DecorativeTowels";
        else if(questionThirteenInput == 2)
            return "ScentedCandle";
        else
            return "";
    }
    
    public String processFourteen(){
        if(questionFourteenInput == 1)
            return "QuestionFifteen";
        else if(questionFourteenInput == 2)
            return "LRPicture";
        else
            return "";
    }
    
    public String processFifteen(){
        if(questionFifteenInput == 1)
            return "ChinaSet";
        else if(questionFifteenInput == 2)
            return "PaperPlates";
        else
            return "";
    }
    
    public String Reset(){
        this.questionOneInput = 0;
        this.questionTwoInput = 0;
        this.questionThreeInput = 0;
        this.questionFourInput = 0;
        this.questionFiveInput = 0;
        this.questionSixInput = 0;
        this.questionSevenInput = 0;
        this.questionEightInput = 0;
        this.questionNineInput = 0;
        this.questionTenInput = 0;
        this.questionElevenInput = 0;
        this.questionTwelveInput = 0;
        this.questionThirteenInput = 0;
        this.questionFourteenInput = 0;
        this.questionFifteenInput = 0;
        
        return "index";
    }

    //Getters and Setters
    public int getQuestionOneInput() {
        return questionOneInput;
    }

    public void setQuestionOneInput(int questionOneInput) {
        this.questionOneInput = questionOneInput;
    }

    public int getQuestionTwoInput() {
        return questionTwoInput;
    }

    public void setQuestionTwoInput(int questionTwoInput) {
        this.questionTwoInput = questionTwoInput;
    }

    public int getQuestionThreeInput() {
        return questionThreeInput;
    }

    public void setQuestionThreeInput(int questionThreeInput) {
        this.questionThreeInput = questionThreeInput;
    }

    public int getQuestionFourInput() {
        return questionFourInput;
    }

    public void setQuestionFourInput(int questionFourInput) {
        this.questionFourInput = questionFourInput;
    }

    public int getQuestionFiveInput() {
        return questionFiveInput;
    }

    public void setQuestionFiveInput(int questionFiveInput) {
        this.questionFiveInput = questionFiveInput;
    }

    public int getQuestionSixInput() {
        return questionSixInput;
    }

    public void setQuestionSixInput(int questionSixInput) {
        this.questionSixInput = questionSixInput;
    }

    public int getQuestionSevenInput() {
        return questionSevenInput;
    }

    public void setQuestionSevenInput(int questionSevenInput) {
        this.questionSevenInput = questionSevenInput;
    }

    public int getQuestionEightInput() {
        return questionEightInput;
    }

    public void setQuestionEightInput(int questionEightInput) {
        this.questionEightInput = questionEightInput;
    }

    public int getQuestionNineInput() {
        return questionNineInput;
    }

    public void setQuestionNineInput(int questionNineInput) {
        this.questionNineInput = questionNineInput;
    }

    public int getQuestionTenInput() {
        return questionTenInput;
    }

    public void setQuestionTenInput(int questionTenInput) {
        this.questionTenInput = questionTenInput;
    }

    public int getQuestionElevenInput() {
        return questionElevenInput;
    }

    public void setQuestionElevenInput(int questionElevenInput) {
        this.questionElevenInput = questionElevenInput;
    }

    public int getQuestionTwelveInput() {
        return questionTwelveInput;
    }

    public void setQuestionTwelveInput(int questionTwelveInput) {
        this.questionTwelveInput = questionTwelveInput;
    }

    public int getQuestionThirteenInput() {
        return questionThirteenInput;
    }

    public void setQuestionThirteenInput(int questionThirteenInput) {
        this.questionThirteenInput = questionThirteenInput;
    }

    public int getQuestionFourteenInput() {
        return questionFourteenInput;
    }

    public void setQuestionFourteenInput(int questionFourteenInput) {
        this.questionFourteenInput = questionFourteenInput;
    }

    public int getQuestionFifteenInput() {
        return questionFifteenInput;
    }

    public void setQuestionFifteenInput(int questionFifteenInput) {
        this.questionFifteenInput = questionFifteenInput;
    }
    
    
}
