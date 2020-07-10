package testCases;
import java.util.Scanner;
public class Codechefsolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a []= new int[n];
		int k = sc.nextInt();
		for(int i=0 ; i<n; i++) {
			a[i]= sc.nextInt();		
			}
		int count =0;
	 for(int i=0; i<n ; i++) {
		if(a[i]%k==0) {
			count++;
		}
	}System.out.println(count);

}
}
