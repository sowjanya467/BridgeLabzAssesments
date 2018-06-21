package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose: code for Tic Tac Toe game
 *
 * @author sowjanya467
 * @version 1.0
 * @since 19-05-17
 *
 * **************************************************************************************************/

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe 
{
	static String[] board;
	static String turn;

	public static void main(String[] args) 
	{
        System.out.println("please enter any number to start the game");
        int in=Utility.readInteger(); 
		board = new String[9];
		turn = "X";
		String winner = null;
		populateEmptyBoard();
		System.out.println("Welcome to A Player Tic Tac Toe.");
		System.out.println("--------------------------------");
        printBoard();
		System.out.println("player B turn Enter a slot number to place X ");
	
		while (winner == null) 
		{
			int numInput;
			numInput = Utility.readInteger();
				if (!(numInput > 0 && numInput <= 9)) 
				{
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
			
			if (board[numInput-1].equals(String.valueOf(numInput))) 
			{
				board[numInput-1] = turn;
				if (turn.equals("X")) 
				{
					turn = "O";
				} else {
					turn = "X";
				}
				printBoard();
				winner = checkWinner();
			} 
			else
			{
				System.out.println("Slot already taken, take slot number:");
				continue;
			}
		}
		if (winner.equalsIgnoreCase("draw")) 
		{
			System.out.println("It's a draw!");
		} else {
			System.out.println("Congratulations! " + winner + "'s have won! .");
		}
	}
    //method to check the winner. It checks the lines 
	static String checkWinner()
	{
		for (int a = 0; a < 8; a++) 
		{
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) 
			{
				return "X";
			} 
			else if (line.equals("OOO")) 
			{
				return "O";
			}
		}

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}
    //prints the board
	static void printBoard() 
	{
		System.out.println("|-----------|");
		System.out.println( "| "+board[0]+"  "  + " " + board[1] +"   " + board[2]+" |" );
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + "   " + board[4] + "   " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + "   " + board[7] + "   " + board[8] + " | ");
		System.out.println("|-----------|");
	}
     //method that takes values from 1 to 9 to print on board
	public static void populateEmptyBoard() 
	{
	for (int a =0; a <9; a++)
	{
			board[a] = String.valueOf(a+1);
	}
	}
}
