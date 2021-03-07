/**
 * get average of numbers entered by user
 * find the number greater than average
 */

import java.util.Scanner;

public class AverageInputInArrays {
	
  public static void main(String[] args) {
	  
    Scanner input = new java.util.Scanner(System.in);
    
    System.out.print("Enter the number of items: ");
    int n = input.nextInt(); 
    
    double[] numbers = new double[n]; // Create an array
    
    //accumulator for sum
    double sum = 0;

    
    for (int i = 0; i < n; i++) {
    	
    	//ask user
    	System.out.print("Enter the numbers: ");
    	numbers[i] = input.nextDouble();
    	sum += numbers[i];
    }
    
    double average = sum / n;

    int count = 0; // The numbers of elements above average
    
    for (int i = 0; i < n; i++) { 
      if(numbers[i] > average) {
    	// Count if number[i] > average
        count++;
      }
    }
    System.out.printf("Average is %.2f", average);
    System.out.println("\nNumber of elements above the average is "
      + count);
  }
}