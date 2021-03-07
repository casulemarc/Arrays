
public class SwapArraysReturnTrue {
	
	
	public static void main(String [] args){
		
		int [] a = {1,2,5,6,3};
		int temp;
		
		for(int value: a) {
			System.out.print(value + ", ");
		}
		System.out.println("\nReverse");
		
		for(int k =0; k < (a.length) / 2; k++){
	        temp = a[k];
	        a[k] = a[a.length-1-k];
	        a[a.length-1-k] = temp;
	    }
		
		for(int value: a) {
			System.out.print(value + ", ");
		}
	}
}
