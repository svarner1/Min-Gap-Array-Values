//Name: Sydney Varner
//PantherID:002-527-007
//Due Date: June 26
//=======================================
import java.util.*;

// This program asks the user to enter an array of integers. The program then calculates the smallest gap between the adjacent array values.
public class Lab_5 {
	//This method find the lowest gap between the array values
	public static int minGap(int[] array) {
		int min;
		int checkedMin;
		//The calculations are only performed if the array length is greater than 1
		if(array.length > 1) {
			//I coded these statements in order to find a value so that the other min values can be compared
			//I do either calculation to find a min because I want to avoid getting a negative number
			if ( array[0] - array[1] > 0 ) {
				min = array[0] - array[1];
			} 
			else {
				min = array[1] - array[0];
			}
			
			/*For each int in the array, a difference value is found by subtracting an int in the array by the subsequent element. 
			 * I check to see if the subtraction results in a negative number in the if statement. If so, th subtraction is done with the values reversed.
			 */
			for(int i = 1; i< array.length-1; i++) {
		       if( array[i] - array[i+1] > 0) {
		    	   //I set the variable checkedMin in order to compare the current min value. If the checkedMin is smaller the min is set equal to the checkedMin
		    	  checkedMin = array[i] - array[i+1];
		    	   if (checkedMin < min) {
		    		   min = checkedMin;
		    	   }
		       }
		       else {
		    	 //I set the variable checkedMin in order to compare the current min value. If the checkedMin is smaller the min is set equal to the checkedMin
		    	   checkedMin = array[i+1] - array[i];
		    	   if (checkedMin < min) {
		    		   min = checkedMin;
		    	   }
		       }
			}
			return min;
		} 
		else {
			//Zero is returned if the array length is not greater than 1
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many elements are there in your array?: ");
		int arrayLength = console.nextInt();
		int[] userArray = new int[arrayLength];
		System.out.print("\nEnter the elements in the array (separated by a space): ");
		//The console reads each integer that the user enters. Then, the values of the array are set in a sequential order starting from the first index
		for(int i = 0; i< arrayLength; i++) {
			int arrayItem = console.nextInt();
			userArray[i] = arrayItem;
		}
		System.out.println("\nThe minimum gap between elements in the array is " + minGap(userArray));
	}
}
