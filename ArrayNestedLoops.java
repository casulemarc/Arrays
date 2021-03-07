//nested loops in arrays
public class ArrayNestedLoops {
	public static void main(String[] args) {
		int [] list = {1,2,3,4,5,6};
		
		//this index skips index at 0 and 1, and starts at 2
		for(int i = 2; i < list.length; i++) {
			
			//we are calling index at 2 = 3;
			// list[i] = 3, list[i-i] == list[3-1] == list[2] = 2 
			list[i] = list[i-1]; // so 2 will be passed down to loop
		}
		
		//to print array you need to loop again
		//this prints index at 0, but stays printing index at 1 cz of first loop
		for(int i=0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
