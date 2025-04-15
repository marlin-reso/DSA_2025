package logicBuildingProblem;

public class ReverseDigit {

	public static void main(String[] args) {
		 int digit = 456;
		 int reverse = 0;
		 
		 for(int i=0; i<=2; i++) {
			 
			 reverse = digit%10+reverse *10;
			 digit = digit/10;
		 }
		 
		 System.out.println(reverse);
		 System.out.println("hello");

	}

}
