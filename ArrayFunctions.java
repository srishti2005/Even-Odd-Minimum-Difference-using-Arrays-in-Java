//ArrayFunctions.java
import java.util.*;
class ArrayFunctions{
	//We have here used ArrayList so that only the even and odd terms get printed in the new arrays .
	public void display(ArrayList<Integer> array){
		System.out.println("Array is:"+array);
	}
	//Method to sort even and odd elements of the input array 
	public void oddEven(int[] array){
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for(int i = 0 ; i < array.length; i++){
			if(array[i] % 2 == 0){
				even.add(array[i]);

			}
			else
			{
				odd.add(array[i]);
			}

		} 
		display(odd);
		display(even);

	}
	//Method to find the  difference between the elements and then print the index of the miimum difference element
	public int minDiff(int[] array){
		int index=0;
		int minDiff = array[1] - array[0];
		for(int i = 0 ; i < array.length-1; i++){
			
			
			if( minDiff < (array[i+1] - array[i])){
				 minDiff = array[i+1] - array[i];
				 index = i;
			}
			
		}
		return index;
		
	}
	
}
