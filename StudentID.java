
public class StudentID {

	public static void main(String[] args) {
		
		//student ids with incomplete
		int [] incompletes = {1,4,7,7,4,9,3,9};
		
		//one student id
		int studentID = 7;
		int studentIDTwo = 4;
		//number of incomplete
		int numberOfIncompletes = 0;
		int numberOfIncompletesTwo = 0;
		
		//check how many times student 7 appears more
		
		for(int k = 0; k < incompletes.length; k++){
		    if(incompletes[k] == studentID){
		        numberOfIncompletes++;
		    }
		}
		System.out.println("Student 7 appears: " + numberOfIncompletes + " times");
		
		//using foreach loop
		for(int id: incompletes) {
			if(id == studentIDTwo) {
				numberOfIncompletesTwo++;
			}
		}
		System.out.println("Student 4 appears: "+ numberOfIncompletesTwo + " times");

	}

}
