package stringPrograms;

public class ZZZpracticeYYYY {

	public static void main(String[] args){
		int num=121, temp=num, reverese=0;
		
		
		while(num>0) {			
		int remainder=num%10;
		reverese=reverese*10+remainder;
		num=num/10;				
	}		
		if(temp==reverese) { 
			System.out.println("number is palindrome");
			
		}else {
			System.out.println("not");
			
		}
	
	}}
