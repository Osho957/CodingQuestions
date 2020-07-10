package testCases;

import java.util.Scanner;

public class ChefandCards {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		int temp1, temp2;
		int sum1 =0;
		int sum2 =0;
		int count1=0 ; int count2=0;
		for(int i=0 ; i<t; i++) {
			int n = sc.nextInt();
			for(int j=0; j<n; j++) {
				int a =sc.nextInt();
				int b =sc.nextInt();
				while(a>0) {
					 temp1 = a%10;
					sum1 = sum1+temp1;
					a =a/10;
				} while(b>0) {
					temp2 = b%10;
					sum2 = sum2+temp2;
					b =b/10;
				}if(sum1>sum2) {
					count1++;
			}else {
				count2++;
			} sum1=0; sum2=0;
			
 			}if(count1>count2) {
				System.out.println("0 "+count1);
			}else if(count2>count1) {
				System.out.println("1 "+count2);
			}else if(count1 ==count2) {
				System.out.println("2 "+count1);
			} count1=0 ; count2=0;
			
		}			
	
	}

}
