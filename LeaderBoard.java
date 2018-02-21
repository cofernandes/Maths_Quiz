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
public class LeaderBoard 
{    
    public void buildBoard(Player[] players)
    {
         System.out.println("Addition Leaderboards");

         for(int i = 0; i < players.length-1; i++)
         {
            if(players[i].getAddAttemptNo()!=0)
            {
            System.out.println("name: " + players[i].getName() + "  score: " +
              players[i].getAddScore() + "  Attemps: " + players[i].getAddAttemptNo());
            }
         }
            
         
         
         System.out.println("Subtraction Leaderboards");
         
         for(int i = 0; i < players.length-1; i++)
         {
             if(players[i].getSubAttemptNo()!=0)
             {
             System.out.println("name: " + players[i].getName() + "  score: " + players[i].getSubScore() + "  Attemps: " + players[i].getSubAttemptNo());
             }
         }   
         
         
         
         System.out.println("Multiplication Leaderboards");
         
         for(int i = 0; i < players.length-1; i++)
         {
             if(players[i].getMulAttemptNo()!=0)
             {
             System.out.println("name: " + players[i].getName() + "  score: " + players[i].getMulScore() + "  Attemps: " + players[i].getMulAttemptNo());
             }
         }   
         
         
         
         System.out.println("Division Leaderboards");
        
         for(int i = 0; i < players.length-1; i++)
         {
             if(players[i].getDivAttemptNo()!=0)
             {
             System.out.println("name: " + players[i].getName() + "  score: " + players[i].getDivScore() + "  Attemps: " + players[i].getDivAttemptNo());
             }
         }    
       
         MathQuiz_V1.sU.menu();
    }   
    
}
