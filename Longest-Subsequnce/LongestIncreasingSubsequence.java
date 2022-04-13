import java.util.ArrayList;

public class LongestIncreasingSubsequence {
	
	private int[] arr;
	private int noOfElements;
	private final int int_min = Integer.MIN_VALUE;

	public LongestIncreasingSubsequence() {
		System.out.println("Executing "+this.getClass());
	}

	public ArrayList<Integer> longestIncSubseq() {
		ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> longestList = new ArrayList<Integer>();
        int currentMax;
        int highestCount = 0;
        try {
			for(int i = 0; i < arr.length;i++)
			{
			    currentMax = int_min;
			    for(int j = i ; j < arr.length ; j++)
			    {
			        if(arr[j] > currentMax)
			        {
			            list.add(arr[j]);
			            currentMax = arr[j];
			        }
			    }

			    if(highestCount < list.size())
			    {
			        highestCount = list.size();
			        longestList = new ArrayList<Integer>(list);  
			    }   
			    list.clear();
			}
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		return longestList; 
		
	}
	
	public int getNoOfElements() {
		return noOfElements;
	}
	public void setNoOfElements(int noOfElements) {
		this.noOfElements = noOfElements;
	}
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	

}