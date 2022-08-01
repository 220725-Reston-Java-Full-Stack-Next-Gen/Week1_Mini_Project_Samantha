/* Samantha Freitas
 * 8/1/2022
 * Revature Week 1 Mini Project
 * 
 *  Reviewing: classes/object creation in Java, Git project management basics, and local file navigation using Linux commands.
 * 
 */
package com.Samantha.code;

import java.util.*;

public class MainDriver {

	public static void main(String[] args) {
		//Step 1: Prompt the user to name their Thermometer. Save the name to a new instance of your Thermometer class.		
		Scanner scanner = new Scanner(System.in); //creates a 	Scanner object named scanner. This will be used to read input.
		
		Thermometer Therm = new Thermometer();
		System.out.println("Please enter your Thermometer name: ");  //requests input
	
		Therm.setName(scanner.nextLine());  //this retrieves the string for the Thermometer name
		
		//Step 2: Print a greeting message to the user to indicate that the app has started running. 		
		System.out.println("Hello, thanks for picking " + Therm.getName() + "!");  //says hello
		
		//Step 3: Prompt the user to enter a Fahrenheit and Celsius value respectively.
		System.out.println("Please enter a Fahrenheit temperature (integer only please): ");  //requests input
		Therm.setDegreesF(scanner.nextInt());  //this retrieves the number for Fahrenheit
		System.out.println("Please enter a Celsius temperature (integer only please): ");  //requests input
		Therm.setDegreesC(scanner.nextInt());  //this retrieves the number for Celsius
		
		//Step 4: Use the conversion methods in the Thermometer class to convert the given values to Celsius and Fahrenheit. Save the converted results into two new int variables. Print the results to the console.
		int cConvert = Thermometer.convertToCelsius(Therm.getDegreesF());
		int fConvert = Thermometer.convertToFahrenheit(Therm.getDegreesC());
		
		System.out.println(Therm.getDegreesF() + " has been converted to " + cConvert + "°C and " + Therm.getDegreesC() + " has been converted to " + fConvert + "°F");  //prints results
		
		//Step 5: Now prompt the user to enter three integer values that represent recent temperature readings. Set this input as the Thermometer's tempReadings value.
		int[] tempRead = new int [3]; //creates an array to store and pass the temperature readings
		System.out.println("Please enter three recent temperature readings(press enter after each number): ");  //requests input
		
		for (int i = 0; i < 3; i++) {
			tempRead[i] = scanner.nextInt();  //this retrieves the integers for temperatures
		}
		Therm.setTempReadings(tempRead); //passes the array of numbers
		
		//Step 6: Call the Thermometer's calculateAvgTemp() method to print the average temperature.
		Thermometer.calculatingAvgTemp(Therm.getTempReadings());
		
		//Step 7: Print a goodbye message to the user to let the user know that the app is closing.
		System.out.println(Therm.getName() + " bids you Adeiu!");  //goodbye
		scanner.close();  // closes the scanner
	}

}
