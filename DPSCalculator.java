/* 
 * Jake Coombes
 * 9/21/2018
 * Damage per second calculator:
 * 		create a code that will allow the user 
 * 		to enter their stats then calculate and
 * 		display the damage per sec
 */

//get the scanner library
import java.util.*;

public class DPSCalculator 
{

	public static void main(String[] args) 
	{
		//create an instance of the scanner class
		Scanner input = new Scanner(System.in);
		
		//declare a double to hold the damage, dps, critical hit chance, and attack speed
		double damage, dps, critChance, attackSpeed;
		
		// get user input (damage, critical hit chance, and attack speed)
		System.out.println("What is the critical hit chance? :");
		critChance = input.nextDouble();
		System.out.println("What is the attack damage? :");
		damage = input.nextDouble();
		System.out.println("What is the attack speed? :");
		attackSpeed = input.nextDouble();
		
		//debug line to make sure the damage is correct
		System.out.println("You inputted");
		System.out.println("\tcritical hit chance " + critChance);
		System.out.println("\tattack damage " + damage);
		System.out.println("\tattack speed " + attackSpeed);
		
		//calculate the dps
		dps = ((critChance * damage * 2) + ((1-critChance) * damage)) * attackSpeed;
		
		//determine and tell the user if its a lot or a little damage
		
		System.out.println("The DPS is: " + dps);
		
		if(dps > 400)
			System.out.println("\nYou are outputting a lot of damage!");
		else if(dps < 100)
			System.out.println("\nYou need to increase your damage!");
	}

}

