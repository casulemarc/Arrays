/**
 * This program prints numbers to an output file
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputFIleArrays {

	public static void main(String[] args) throws FileNotFoundException {
		
		//array
		int[] myList = {10,34,23,67,8,3};
		
		//open a file
		PrintWriter myFile = new PrintWriter("ArrayList.txt");
		
		//write to a file
		for(int i=0; i<myList.length; i++) {
			myFile.print(myList[i] + " ");
		}
		
		//close the file
		myFile.close();
		
		

	}

}
