package testCases;

import java.util.Scanner;

public class Codechefsum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		for(int i =0; i<t ; i++) {
			int n = sc.nextInt();
		
			int temp; int sum = 0;
			while(n>0) {
			temp = n%10;
			sum += temp;
			n /= 10;
			}
			
		System.out.println(sum);
		}	

	}

}
