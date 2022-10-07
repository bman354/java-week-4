package week3;

public class Main {

	public static void main(String[] args) {
		
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int totalAge = 0;
		int meanAge = 0;
		
		

		for(int i = 0; i < ages.length; i++) {
			totalAge += ages[i];
		}
		
		meanAge = totalAge / ages.length;
		System.out.println("The mean age is " + meanAge);
		
		
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalLetters = 0;
		int meanLetters = 0;
		String allNames = "";
		
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		for(int averageLetters = 0; averageLetters < names.length; averageLetters++) {
			totalLetters += names[averageLetters].length();
		}
		meanLetters = totalLetters/names.length;		
		
		System.out.println("The mean number of letters is " + meanLetters);
		
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		for(int concatinationArray = 0; concatinationArray < names.length; concatinationArray++) {
			allNames = allNames + " " + names[concatinationArray];
		}
		System.out.println(allNames);
		
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[6];
		
		for(int lengthArray = 0; lengthArray < names.length; lengthArray++) {
			nameLengths[lengthArray] = names[lengthArray].length();
		}
		System.out.println(nameLengths[0]);
		
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumOfLengthArray = 0;
		for(int sumOfLengthArrayI = 0; sumOfLengthArrayI < nameLengths.length; sumOfLengthArrayI++) {
			sumOfLengthArray += nameLengths[sumOfLengthArrayI];
			
		}
		
		System.out.println("Sum of nameLengths is " + sumOfLengthArray);
		
		
		
		
		
		
		//method tests
		System.out.println(concatinate("nerd", 4));
		System.out.println(fullName("John", "Smith"));
		System.out.println(isArrayGreater100(nameLengths));
		
		double[] gpa = {4.0, 2.5, 3.2, 3.4, 2.0, 4.1};
		System.out.println(averageDoubleArray(gpa));
		
		double[] gpa2 = {4.1, 2.5, 2.9, 3.5, 2.0, 3.2};
		System.out.println(isAverageGreaterDouble(gpa, gpa2));
		
		System.out.println(willBuyDrink(false, 10.51));
		
		//end of method tests
		
		
		
		
	}	//end of main method
	
	//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String concatinate(String word, int n) {
		String returnWord = "";
		
		for(int numWords = n; numWords > 0; numWords--) {
			returnWord += word;
		}
		return returnWord;
	}
	
	//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String fullName(String firstName, String lastName) {
		String fullString = "";
		
		fullString = firstName + " " + lastName;
		
		return fullString;
	}
	
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean isArrayGreater100(int[] intArray)	{
		int runningSum = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			runningSum += intArray[i];
		}
		
		
		if(runningSum > 100) {
			return true;
		} else {
			return false;
		}
	}
			

	//Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double averageDoubleArray(double[] doubleArray) {
		double average = 0;
		double runningDoubleSum = 0;
		
		for(int count = 0; count < doubleArray.length; count++) {
			runningDoubleSum += doubleArray[count];
		}
		average = runningDoubleSum/doubleArray.length;
		return average;
	}
			
	//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean isAverageGreaterDouble(double[] array1, double[] array2) {
		
		if (averageDoubleArray(array1) > averageDoubleArray(array2)){
			return true;
		} else {
			return false;
		}
	}
			
	//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
			
	//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	public static int sumOfArray(int[] array) {
		int sum = 0;
		for(int count = 0; count < array.length; count++){
			sum += array[count];
		}
		return sum;
	}
	
	//this method takes in an integer array, and returns the sum of all the values. I made it to simplify the rest of my code, as I found myself doing this repeatedly
	
	
}
