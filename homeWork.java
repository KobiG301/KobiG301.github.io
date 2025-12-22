//Kobi George
import java.util.Random;
import java.util.Scanner;
public class homeWork {
	
//	public String getCpu() {
//		String [] Choices = {"Rock", "Paper", "Scissors"};		
//		Random rand = new Random();
//		return Choices[rand.nextInt(Choices.length);             
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting everything up, 
		Random rand = new Random();
		String [] Choices = {"Rock", "Paper", "Scissors"};		
		Scanner k = new Scanner(System.in);
		int p1Score = 0;
		int p2Score = 0;
//		String cpuChoice = Choices[rand.nextInt(Choices.length)];
		boolean playAgain = true;
		//While loop allows the for loop to be re entered after 3 rounds
		while(playAgain) {
		     for(int i = 0; i < 3;i++) {
			//Creating the game itself
			     String cpuChoice = Choices[rand.nextInt(Choices.length)];
			     System.out.println("Choose between rock, paper, scissors");
			     String input = k.nextLine();
			//Keeping score and finding who wins vs who
			     System.out.println(input + " vs " + cpuChoice);
			     if(input.toUpperCase().equals(cpuChoice.toUpperCase())) {
				    System.out.print("Tie!");
			}
			     if(input.toUpperCase().equals("ROCK")) {
				    if(cpuChoice.toUpperCase().equals("SCISSORS")){
				       p1Score += 1;

				}
				    else if(cpuChoice.toUpperCase().equals("PAPER")) {
					        p2Score += 1;
				}
				    System.out.println(p1Score + " - " + p2Score);
			}
			     else if(input.toUpperCase().equals("SCISSORS")) {
				   if(cpuChoice.toUpperCase().equals("ROCK")) {
					  p2Score += 1;
				}
				   else if(cpuChoice.toUpperCase().equals("PAPER")) {
					  p1Score += 1;
				}
				   System.out.println(p1Score + " - " + p2Score);
			}
			    else if(input.toUpperCase().equals("PAPER")) {
				   if(cpuChoice.toUpperCase().equals("ROCK")) {
					  p1Score +=1;
				}
				   else if(cpuChoice.toUpperCase().equals("SCISSORS")) {
					  p2Score +=1;
				}
				   System.out.println(p1Score + " - " + p2Score);
			}
			    else {
			    	System.out.println("Invalid answer, automatic cpu win!");
			    	p2Score += 1;
			    	System.out.println(p1Score + " - " + p2Score);
			    }
			    
			

//			if(p1Score == win && i==3) {
//				System.out.println("You win!");
//			}
//			else if(p2Score == win && i==3) {
//				System.out.println("CPU wins!!");
//				if(ans.toUpperCase().equals("YES")) {
//					i = 0;
//				}
//				else {
//					break;
//				}
//			if(p1Score == win || p2Score == win) {
//			   p1Score = 0;
//			   p2Score = 0;
//			   System.out.println("Would you like to play again?");
//			   String ans = k.nextLine();
//			   if(ans.toUpperCase().equals("YES")) {
//				  i = 0;
//				}
//				else {
//				  break;
//				}					
//					
//				}
				

			}
		     //Printing who won after the 3 rounds
		if(p1Score > p2Score) {
			System.out.println("You win");
		}
		else if(p1Score < p2Score) {
			System.out.println("CPU wins");
		}
		else {
			System.out.println("tie");
		}
		//Play again logic and resetting the score so last games score doesnt carry on with the new one
		System.out.println("Would you like to play again");
		String var = k.nextLine();
		if(var.equalsIgnoreCase("yes")) {
		   playAgain = true;
		   p1Score = 0;
		   p2Score = 0;
		}
		//Ending the code if the input says no
		else {
			playAgain = false;
		}
		}



					}
			


			
		
		



	}


