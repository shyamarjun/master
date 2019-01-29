import java.util.*;
import static java.lang.System.out;

public class ArraySortingOne {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] myIntArray = getIntArray(5);
		
		printArray(myIntArray);
		
		sortIntArray(myIntArray);
		
		printArray(myIntArray);
		
	}
	
	public static  int[] getIntArray(int number) {
		out.println("Enter " + number + " integerts\r");
		int[] insideArray = new int[number];
		for (int i =0; i<number ; i++) {
			insideArray[i] = scan.nextInt();
		}
		return insideArray;
	}
	
	public static void printArray(int[] array) {
		out.println();
		for(int i=0; i< array.length; i++) {
			out.print(array[i] + " ");
		}
	}
	
	public static int[] sortIntArray(int[] array) {
		int temp;
		for (int i =0; i<array.length -1 ; i++) {
			for(int j =0; j < array.length -1 -i; j++) {
				out.println("i = " + i + " j = " + j);
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j +1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
}
