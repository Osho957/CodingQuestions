package testCases;

import java.util.Scanner;

public class CodechefLuckyfour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
		int n =sc.nextInt();
		int count = 0;
		
	while(n>0) {
		count = (n % 10 == 4) ? count + 1 : count; 
                
    n = n / 10;		
    
    }System.out.println(count);
	
		}
	}

}
