
/*Flip Coin and print percentage of Heads and Tails
I/P -> The number of times to Flip Coin. Ensure it is positive integer.
Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
O/P -> Percentage of Head vs Tails*/
/*************************************************************************************************************
 *
 * purpose:FlipCoin and print percentage of heads and tails
 *
 * @author sowjanya467
 * @version 1.0
 * @since 15-05-17
 *
 * **************************************************************************************************/
package com.bridgelabz.functionprogs;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) 
    {
       //Initialization and declaration of variables
        //int n,h=0,t=0;
        //double hp,tp;
    	int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number of times to flip coin");
        int times = sc.nextInt();
        for(int i=0;i< times;i++)
        {
            double random=Math.random();
            if(random < 0.5)
                count++;
        }
        double headPer= ((times-count)*100)/times;
        System.out.println(count);
        System.out.println("Heads percentage is :"+ headPer +"%");
        System.out.println("Tails percentage is :"+ (100-headPer) +"%");

       /* hp = h/(double) n*100;
        tp = t / (double)n*100;
        System.out.println(h);
        System.out.println(t);
        System.out.println("heads: " + hp);
        System.out.println("tails: " + tp);*/
        }
    }

