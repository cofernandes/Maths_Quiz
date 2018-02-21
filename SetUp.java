/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsquiz_v1;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class SetUp 
{
    Questions qS   = new Questions();
    LeaderBoard lB = new LeaderBoard();
    Scanner kB     = new Scanner(System.in);
    public static Player[] players = new Player[10];
    int rounds = 0;
    
    
      public void menu()
      {
         if(rounds == 0)
         {
             for(int i=0;i<10;i++)
            {
                Player p = new Player();
                 players[i]= p;
         
            // System.out.println(players[i].toString());
            }
         }
         rounds++;
         
         System.out.println("Mind Bending Math");
         System.out.println();
         System.out.println("Select 1 to enter quiz and 2 to view Leadboards");
                   
        switch(kB.nextInt())
        {
           case 1: {System.out.println("Welcome to the maths quiz, Please enter your Name");
                     players[MathQuiz_V1.position].setName(kB.next());
                     choiceLevel(players[MathQuiz_V1.position]);}
           break;
           case 2: {lB.buildBoard(players);}
           break;
           default:{ System.out.println(" incorrect choice, please try again");
                      menu();
                   }
        }
              
      }
    
    public void choiceLevel(Player p1)
    {
      System.out.println("please select your difficulty level");
      System.out.println("enter  1  for easy");
      System.out.println("enter  2  for medium");
      System.out.println("enter  3  for hard");
      
      switch(kB.nextInt())
     {
         case 1: {p1.setDiffLevel("easy");}
         break;
         case 2: {p1.setDiffLevel("med");}
         break;
         case 3: {p1.setDiffLevel("hard");}
         break;
         default:{ System.out.println(" incorrect choice, please try again");
                    choiceLevel(p1);
                 }
     }
      players[MathQuiz_V1.position]= p1;
      choiceType(players[MathQuiz_V1.position]);
      
    }
    
    public void choiceType(Player p1)
    {
      System.out.println("please select your question type");
      System.out.println("enter  1  for addition");
      System.out.println("enter  2  for subtraction");
      System.out.println("enter  3  for multiplication");
      System.out.println("enter  4  for division");
      
     switch(kB.nextInt())
     {
         case 1: {p1.setAddAttemptNo(p1.getAddAttemptNo()+1);
                    p1.setQuestionType("Addition");qS.addition(p1);}
         break;
         case 2: {p1.setSubAttemptNo(p1.getSubAttemptNo()+1);
                    p1.setQuestionType("Subtraction");qS.subtraction(p1);}
         break;
         case 3: {p1.setMulAttemptNo(p1.getMulAttemptNo()+1);
                    p1.setQuestionType("multiplication");qS.multiplication(p1);}
         break;
         case 4: {p1.setDivAttemptNo(p1.getDivAttemptNo()+1);
                    p1.setQuestionType("Division");qS.division(p1);}
         default:{ System.out.println(" incorrect choice, please try again");
                    choiceType(p1);
                 }             
     }
     players[MathQuiz_V1.position]= p1;
    }
   
}
