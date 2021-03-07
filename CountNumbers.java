
public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = {{1,2,3,4},{4,5,6,7}, {8,9,10,2,6,7}};
		
	    System.out.println("The array {1,2,3,4},{4,5,6,7}, {8,9,10,2}\nlength a[] is " + a.length + "\nlength a[1] is " + a[1].length + "\nlength a[2] is " + a[2].length);
	    
	    for(int i =0; i<a.length;i++) {
	    	java.util.Arrays.sort(a[i]);;
	    	for(int j=0; j<a[i].length; j++) {
	    		System.out.println(a[i][j]+ " ");
	    	}
	    	System.out.println();
	    }
	   
	    
	    System.out.println("a[0] is " + a.length + " " + a[1].length);

	}

}
