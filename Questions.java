/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsquiz_v1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Questions 
{
    Scanner kB = new Scanner(System.in);
    Random rN  = new Random();
    int range  = 0;
    int round = 5;
    
    public void addition(Player p1)
    {
        if("easy".equals(p1.getDiffLevel()))
        {
            range = 19;
        }
        else if("med".equals(p1.getDiffLevel()))
        {
            range = 39;
        }
        else
        {
            range = 59;
        }
        
        for(int i=0; i< round; i++)
        {
            int num1 = 0;
            int num2 = 0;
            int ans  = 0;
            int count = i+1;
            
            num1 = rN.nextInt(range)+1;
            num2 = rN.nextInt(range)+1;
            ans = num1 + num2;
            
            System.out.println(" Question : "+ count +" : ...... "+ num1 +" + "+ num2);
            System.out.println("enter your answer");
            if(kB.nextInt() == ans)
            {
                p1.setAddScore(p1.getAddScore()+1);
                 System.out.println("correct");
            }
            else
            {
                 System.out.println("incorrect");
            }
        }
         System.out.println("your score : "+ p1.getAddScore());
         
         System.out.println("your stats : "+ p1);
         
         SetUp.players[MathQuiz_V1.position] = p1;
         MathQuiz_V1.position++;
         
         MathQuiz_V1.sU.menu();

    }
    
    
    public void subtraction(Player p1)
    {
        if("easy".equals(p1.getDiffLevel()))
        {
            range = 19;
        }
        else if("med".equals(p1.getDiffLevel()))
        {
            range = 39;
        }
        else
        {
            range = 59;
        }
        
        for(int i=0; i< round; i++)
        {
            int num1 = 0;
            int num2 = 0;
            int ans  = 0;
            int count = i+1;
            
            num1 = rN.nextInt(range)+1;
            num2 = rN.nextInt(range)+1;
            ans = num1 - num2;
            
            System.out.println(" Question : "+ count +" : ...... "+ num1 +" - "+ num2);
            System.out.println("enter your answer");
            if(kB.nextInt() == ans)
            {
                p1.setSubScore(p1.getSubScore()+1);
                 System.out.println("correct");
            }
            else
            {
                 System.out.println("incorrect");
            }
        }
         System.out.println("your score : "+ p1.getSubScore());
         System.out.println("your stats : "+ p1);
         SetUp.players[MathQuiz_V1.position] = p1;
         MathQuiz_V1.position++;
         MathQuiz_V1.sU.menu();

    }
    public void multiplication(Player p1)
    {
        if("easy".equals(p1.getDiffLevel()))
        {
            range = 19;
        }
        else if("med".equals(p1.getDiffLevel()))
        {
            range = 39;
        }
        else
        {
            range = 59;
        }
        
        for(int i=0; i< round; i++) 
        {
            int num1 = 0;
            int num2 = 0;
            int ans  = 0;
            int count = i+1;
            
            num1 = rN.nextInt(range)+1;
            num2 = rN.nextInt(range)+1;
            ans = num1 * num2;
            
            System.out.println(" Question : "+ count +" : ...... "+ num1 +" * "+ num2);
            System.out.println("enter your answer");
            if(kB.nextInt() == ans)
            {
                p1.setMulScore(p1.getMulScore()+1);
                 System.out.println("correct");
            }
            else
            {
                 System.out.println("incorrect");
            }
        }
         System.out.println("your score : "+ p1.getMulScore());
         System.out.println("your stats : "+ p1);
         SetUp.players[MathQuiz_V1.position] = p1;
         MathQuiz_V1.position++;
         MathQuiz_V1.sU.menu();

    }
    public void division(Player p1)
    {
        if("easy".equals(p1.getDiffLevel()))
        {
            range = 19;
        }
        else if("med".equals(p1.getDiffLevel()))
        {
            range = 39;
        }
        else
        {
            range = 59;
        }
        
        for(int i=0; i< round; i++)
        {
            int num1 = 0;
            int num2 = 0;
            double ans  = 0;
            int count = i+1;
            
            num1 = rN.nextInt(range)+1;
            num2 = rN.nextInt(range)+1;
            ans = num1 / num2;
            
            System.out.println(" Question : "+ count +" : ...... "+ num1 +" / "+ num2);
            System.out.println("enter your answer");
            if(kB.nextDouble() == ans)
            {
                p1.setDivScore(p1.getDivScore()+1);
                 System.out.println("correct");
            }
            else
            {
                 System.out.println("incorrect");
            }
        }
         System.out.println("your score : "+ p1.getDivScore());
         System.out.println("your stats : "+ p1);
         SetUp.players[MathQuiz_V1.position] = p1;
         MathQuiz_V1.position++;
         MathQuiz_V1.sU.menu();

    }
    
    
    
}
