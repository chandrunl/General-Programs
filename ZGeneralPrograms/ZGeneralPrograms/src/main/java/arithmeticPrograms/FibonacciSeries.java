package arithmeticPrograms;

public class FibonacciSeries {
	
	public static void main(String args[]) {

	int num1=0;
	int num2=1;
	int num=10;
	//Logic of the programs
	for(int i=0;i<=num;i++) {
		System.out.println(num1+" ");
		int num3=num2+num1;
		num1=num2;
		num2=num3;	
	}}	
}
