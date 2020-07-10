package testCases;

import java.util.Scanner;

public class Headbob {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t-->0){
			
		    int n = sc.nextInt();
		    sc.nextLine();
		 String s = sc.nextLine();
		 String ans ="NOT SURE";
		 for (int i = 0; i < n; i++) {
		    	char x = s.charAt(i);
		   if(x=='Y'){
			   ans = "NOT INDIAN";
			   break;
          }      if(x=='I') {
                	ans = "INDIAN";
                	break;
         } 
		} System.out.println(ans);
		}
	}

}
