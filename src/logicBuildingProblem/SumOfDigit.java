package logicBuildingProblem;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int value = 567;
		int sum = 0;
		for(int i=0;i<=3;i++) {
			
			sum = value%10+sum;
			value = value/10;
		}
         
		System.out.println(sum);
	}

}
