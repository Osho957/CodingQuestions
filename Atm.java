package testCases;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   double x = sc.nextInt();
		    double n = sc.nextDouble();
		    DecimalFormat format = new DecimalFormat("0.00"); 
		    if(x%5==0 && x < n-0.5){
		        double res = n - x - 0.50;
		        System.out.println(format.format(res));
		    }else{
		       System.out.println(format.format(n));
		    }

	}
}
