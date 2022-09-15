package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter start amount: ");
		int amount = in.nextInt();
		System.out.println("Please enter win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Please enter wining limit: ");
		int winLimit = in.nextInt();
		System.out.println("Please enter number of simulation: ");
		int totalSimulation = in.nextInt();
		int numWin = 0;
		int numLose = 0;
		
		for (int day = 1; day <= totalSimulation; day++)
		{
			double chance = Math.random(); 
			boolean winLose = chance > winChance;
			
				while (amount < winLimit && amount > 0)
				{
					if (winLose == true)
					{
						amount++;
						numWin++;
					}
					else if (winLose == false)
					{
						amount--;
						numLose++;
					}
	
				}
				System.out.println("Simulation day: " + day);
					
			}
		
			
			System.out.println(amount);
			System.out.print("Losses: " + numWin);
			System.out.println(" Win: " + numLose);

	}

}
