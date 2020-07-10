package testCases;
import java.util.*;
import java.lang.*;
import java.io.*;

public class ChefandString {

	public static void main(String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
		int sum = 0;
		int t = sc.nextInt();
		for(int k =0 ;k<t ;k++) {
     int  n =sc .nextInt();
     int a[] = new int[n];
     for(int i=0 ;i< n ;i++) {
    	 a[i]=sc.nextInt();
     } 
     for(int i=1; i<n; i++) {
    	 if(a[i]>a[i-1]) {
    	sum = sum+ a[i]-a[i-1]-1;
    	 } else {
    		 sum = sum+ a[i-1]-a[i]-1;
    	 } 
     }System.out.println(sum);
		sum =0;
		}
    
	}
}
