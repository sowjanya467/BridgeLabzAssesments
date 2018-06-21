/*Gambler
Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
I/P -> $Stake, $Goal and Number of times
Logic -> Play till the gambler is broke or has won
O/P -> Print Number of Wins and Percentage of Win and Loss.*/

package com.bridgelabz.functionprogs;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

import java.util.*;


/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since 17-05-17
 *
 * **************************************************************************************************/
public class Gambler { 

    public static void main(String[] args) {
    	System.out.println("enter stake,goal,trails");
        int stake  = Utility.readInteger(); // gambler's stating money
        int goal   = Utility.readInteger();   // gambler's goal to be reached
        int trials = Utility.readInteger();    // number of trials 

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        //loop to repeat trails
        for (int t = 0; t < trials; t++) {

            int mny = stake;
            while (mny > 0 && mny < goal) {
                bets++;
                if (Math.random() < 0.5) 
                	mny++;     // win $1
                else                   
                	mny--;     // lose $1
            }
            if (mny == goal) 
            	wins++;                // did gambler achieved goals
        }
        
        double percentageofwins= 100*wins/trials;
        double average=bets/trials;
        int loss=trials-wins;
         double percentageofloss=100*loss/trials;
        // print results
        System.out.println("bets="+bets);
        System.out.println(loss+ "loss of =" +trials);
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of  wins = " + percentageofwins);
        System.out.println("Percent of loss = " + percentageofloss);
        System.out.println("Avg bets = " + average);
    }

}
