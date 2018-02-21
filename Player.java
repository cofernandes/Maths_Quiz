/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsquiz_v1;

/**
 *
 * @author crist
 */
public class Player 
{
    private static int iDNum;
    private String name;
    private String questionType;
    private String diffLevel;
    private int addAttemptNo;
    private int subAttemptNo;
    private int mulAttemptNo;
    private int divAttemptNo;
    private int addScore = 0;
    private int subScore = 0;
    private int mulScore = 0;
    private int divScore = 0;


    public Player(){iDNum++;}
    
    public int getiDNum(){return iDNum;}
    
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


    public String getQuestionType() {return questionType;}
    public void setQuestionType(String type) {this.questionType = type;}


    public String getDiffLevel() {return diffLevel;}
    public void setDiffLevel(String level) {this.diffLevel = level;}


    public int getAddAttemptNo() {return addAttemptNo;}
    public void setAddAttemptNo(int addattempt) {this.addAttemptNo = addattempt;}


    public int getSubAttemptNo() {return subAttemptNo;}
    public void setSubAttemptNo(int subattempt) {this.subAttemptNo = subattempt;}


    public int getMulAttemptNo() {return mulAttemptNo;}
    public void setMulAttemptNo(int mulattempt) {this.mulAttemptNo = mulattempt;}


    public int getDivAttemptNo() {return divAttemptNo;}
    public void setDivAttemptNo(int divattempt) {this.divAttemptNo = divattempt;}


    public int getAddScore() {return addScore;}
    public void setAddScore(int addscore) {this.addScore = addscore;}


    public int getSubScore() {return subScore;}
    public void setSubScore(int subscore) {this.subScore = subscore;}


    public int getDivScore() {return divScore;}
    public void setDivScore(int divscore) {this.divScore = divscore;}


    public int getMulScore() {return mulScore;}
    public void setMulScore(int mulscore) {this.mulScore = mulscore;}

        @Override
        public String toString() {
            return "" + name + "{questionType=" + questionType + ", diffLevel=" + diffLevel + ", addScore=" + addScore + ", subScore=" + subScore + ", mulScore=" + mulScore + ", divScore=" + divScore + '}';
        }
    
}
