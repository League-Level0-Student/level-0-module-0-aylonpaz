package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String math	= JOptionPane.showInputDialog("What is 10 to the third power");
		// 2.  Ask the user a question 

		// 3.  Use an if statement to check if their answer is correct
		if(math.equals("1000") || math.equals("1,000")||math.equals("1.000")) {
			score +=1;
			JOptionPane.showMessageDialog(null,"Correct! Your score is a 1!");


		}else { 
			JOptionPane.showMessageDialog(null, "Wrong, go to school! Your score is Currently 0");
			if(score >0) {
				score-=1;
			}
		}
		// 4.  if the user's answer was correct, add one to their score 

		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
		// Option: Subtract a point from their score for a wrong answer
		String round2 = JOptionPane.showInputDialog("How Many continents are there?");
		if(round2.equals("7")|| round2.equalsIgnoreCase("seven")) {
			score+=1; 
			JOptionPane.showMessageDialog(null, "Correct! Your score is " +score);
		}else {
			JOptionPane.showMessageDialog(null, "I'm not mad, I'm just disapionted. ");
			JOptionPane.showMessageDialog(null, " Hey loser, your score is " + score);
			if(score >0)
				score-=1;
		}
		String number3 = JOptionPane.showInputDialog("A prisim has dimentions of 4, 3, and 5. What is the volume of the prisim?");

		if(number3.equals("60") ||number3.equalsIgnoreCase("Sixty")) {
			score +=1;
			JOptionPane.showMessageDialog(null, "Imagine being happy you got fifth grade math right. Your score is " +score);
		}else {
			JOptionPane.showMessageDialog(null,"ARE YOU KIDDING ME! Your score is currently " +score);
			if(score>0)
				score -=1;
		}


		// After all the questions have been asked, tell the user their final score 
		if(score == 3) {
			JOptionPane.showMessageDialog(null, "Good Job, your final score is " + score);
		}else {
			JOptionPane.showMessageDialog(null, "Your a loser! Your score is " +score);
		}
	}
}