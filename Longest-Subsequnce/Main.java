import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("...Executing Main...");
		
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		
		System.out.println("Enter number of elements do you want to insert into an array: ");
		int noOfElements = scan.nextInt();
		
		lis.setNoOfElements(noOfElements);
		
		int array[] = new int[noOfElements];
		System.out.println("Enter "+noOfElements+" integer values: ");
		for(int i=0 ; i < noOfElements ; i++) {
			array[i]=scan.nextInt();
		}
		lis.setArr(array);
		
		ArrayList<Integer> resultArray = lis.longestIncSubseq();
        
        String result = resultArray.stream().map(Object::toString).collect(Collectors.joining(", "));
        
        System.out.println("....................................");
        System.out.println("The Longest Increasing Subsequence: [" + result+ "]");
        System.out.println();
        System.out.println("Length of Longest Increasing Subsequence: " + resultArray.size());
        System.out.println("....................................");
        
        System.out.println("...Closing Application...");
	}
	
	
}