public class REverseNumbers {

	public static void main(String[] args) {
		
		//reverse numbers the numbers on a list
		
		
		int [] myArray = {1,2,6,7,9,5};
		
		int temp;
		
		for (int k = 0; k < (myArray.length)/2; k++) {
			
			//this will reverse the array
			temp = myArray[k];
			myArray[k] = myArray[myArray.length-1-k];
			myArray[myArray.length-1-k] = temp;
		}
		
		//now lets print the array again using for-each loop or regular loop
		for(int reverseArray: myArray) {
			
			System.out.println(reverseArray);
		}
		
	}

}
