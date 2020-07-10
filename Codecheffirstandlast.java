package testCases;
import java.util.Scanner;
public class Codecheffirstandlast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0 ;i<t; i++) {
			int n= sc.nextInt();
		int ld, fd;
		ld=n%10;
	while(n>=10) {
		n= n/10;
	} fd =n;
	System.out.println(ld+fd);
	}
	}
}
