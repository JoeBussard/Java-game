/*****************************
** Java game *****************
*****************************/



import java.io.*;
import java.util.*;

class Player {
	int myNumber = 0;	//Guessed number
	int theNumber;		//Real number
	int tries;			//Number of attempts
	Boolean winner = false;
	Random rand = new Random();
	public void runGame(){
		theNumber = rand.nextInt(10) +1;
		setup();
		while(!winner){
		guess();
		score();
		}
	}
	void setup(){
		System.out.println("Guess a number between 1 and 10\n");
		System.out.println("Hint: The number is:" + theNumber);
		}
	void guess(){
		myNumber = System.in.nextInt();
		tries++;
		}
	void score(){
		if (myNumber == theNumber){
			System.out.println("Congrats you got it! It took you:");
			if (tries==1){ System.println("1 try");}
			else{System.out.println(tries + " tries");}
		}
		else {
			
			winner=true;}
		}

	}

class Game {
	public static void main(String[] args)
	{
		Player player1 = new Player();

		player1.runGame();

		System.exit(0);

	}
}