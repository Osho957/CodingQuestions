package testCases;

import java.util.Scanner;

public class Rect {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0) {
		int a[] = new int[4];
	    for(int i=0; i<4;i++) {
	    	a[i]=sc.nextInt();
	    }
	    int temp=0;
	    for(int i=0; i<4;i++) {
	    	 for(int j=i+1; j<4;j++) {
	    		 if(a[i]==a[j]) {
	    			 temp++;
	    		 }
	    	 }
	    } if(temp%2==0) {
	    	System.out.println("YES");
	    }else {
	    	System.out.println("NO");
	    }
	}
	}

}
