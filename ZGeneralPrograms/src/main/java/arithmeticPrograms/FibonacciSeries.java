package arithmeticPrograms;

import org.testng.annotations.Test;

public class FibonacciSeries {
	
	@Test
	public void Test() {
	int num1=0;
	int num2=1;
	int num=10;
	
	for(int i=0;i<=num;i++) {
		System.out.println(num1+" ");
		int num3=num2+num1;
		num1=num2;
		num2=num3;	
	}}

}
