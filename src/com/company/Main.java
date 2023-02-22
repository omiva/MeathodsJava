package com.company;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner aa=new Scanner(System.in);
        int LevelCompletionScore=aa.nextInt();

        Scanner bb=new Scanner(System.in);
        int Level=bb.nextInt();

        Scanner cc=new Scanner(System.in);
        int Bonus=cc.nextInt();
        CalScore(true,LevelCompletionScore,Level,Bonus);
    }
    public static void CalScore(boolean Game, int LevelCompletionScore,int Level, int Bonus)
    {
        if(Game)
        {
            int FinalScore= LevelCompletionScore*(Level+Bonus);
            System.out.println("YOUR FINAL SCORE IS: "+FinalScore);
        }
    }
}
