package com.Samantha.code;

public class Thermometer {
	
	private int degreesF;
	private int degreesC;
	private String name;
	private int[] tempReadings = new int [3];
	
	//what is needed to make a class?
	//the object must have a constructor
	public Thermometer() {
		//no args constructor
		super(); // indicates that this object derives from the object class. Even if removed, is still implicitly in the background.
		//the object class is the parent class for all java objects
		//therefore, the super keyword allows all subclasses to have access to the object class methods
	}
		
	public Thermometer(int degreesF, int degreesC, String name, int[] tempReadings) {
		//all args constructor (arguments)
		this.degreesF = degreesF; //references the first age parameter and sets it to the input given when the class is called
		this.degreesC = degreesC;
		this.name = name;
		this.tempReadings = tempReadings;
		
		}
	//getters and setters for each field
	public int getDegreesF() {
		return degreesF;
	}

	public void setDegreesF(int degreesF) {
		this.degreesF = degreesF;
	}

	public int getDegreesC() {
		return degreesC;
	}

	public void setDegreesC(int degreesC) {
		this.degreesC = degreesC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getTempReadings() {
		return tempReadings;
	}

	public void setTempReadings(int[] tempReadings) {
		this.tempReadings = tempReadings;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Thermometer " + name + ": " + convertToCelsius(degreesF) + "°C, " + convertToFahrenheit(degreesC) + "°F";
	}
	
	public static int convertToFahrenheit(int c) {
		int f = (int) ((c-32)*.5556);
		return f;
	}
	
	public static int convertToCelsius(int f) {
		int c = (int) ((f*1.8)+32);
		return c;
	}
	
	public static void calculatingAvgTemp(int[] temps) {
		int average = (temps[0] + temps[1] + temps[2]) / 3; 
		System.out.println("The average of the temperatures you entered is: " + average + "°");
		
	}
	
}