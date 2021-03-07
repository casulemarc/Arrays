import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This program reads data from an existing file
 * 
 * @author casul
 *
 */
public class ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Declare the size of elements we want from the  list
		final int SIZE = 5;
		
		//create our new array to hold the only data we want into our console
		int[] myArray = new int[SIZE];
		
		//loop control
		int index = 0;
		
		//open a file
		File myFile = new File("ArrayList.txt");
		
		//request or read data from myFile
		Scanner inputFile = new Scanner(myFile);
		
		//read from file and check errors using while
		while(inputFile.hasNext() && index < myArray.length) {
			
			//assign the values from txt to our list myArray
			myArray[index] = inputFile.nextInt();
			
			//got to next index in subscript
			index++;
		}
		//close file
		inputFile.close();
		
		//print out the new array
		for(int values: myArray) {
			System.out.print(values + " ");
		}

	}

}
