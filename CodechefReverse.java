package testCases;

import java.util.Scanner;

public class CodechefReverse {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t =sc.nextInt();
	for(int i=0; i<t;i++) {
	int n = sc.nextInt();
	int rev =0;
		while(n>0) {
		rev=rev*10;
		rev= rev+n%10;
				n=n/10;
		}System.out.println(rev);
	}
	}
}
