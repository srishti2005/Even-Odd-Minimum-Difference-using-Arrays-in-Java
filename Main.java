// Mian.java

class Main{
	public static void main(String args[]){
		UserInput in = new UserInput();
		ArrayFunctions functions = new ArrayFunctions();
//		functions.oddEven(in.arrayInput());
		int n = functions.minDiff(in.arrayInput());
		System.out.println("The index is:" +n);
	}
	
}