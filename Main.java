// Mian.java

class Main{
	public static void main(String args[]){
		UserInput in = new UserInput();
		ArrayFunctions functions = new ArrayFunctions();
		// Calling the even/odd array display method 
		functions.oddEven(in.arrayInput());
		// Calling the min difference method
		int n = functions.minDiff(in.arrayInput());
		System.out.println("The index is:" +n);
	}
	
}
