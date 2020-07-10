package testCases;
import java.util.Scanner;
public class TheLeadGame {

	public static void main(String[] args) {
	
	
			Scanner sc =new Scanner(System.in);
			int n = sc.nextInt(); //no of round
		
		    int lead = 0; // kaun player kis round me jade aage hai
		    int pos =0;  // player ki position
		   int t1=0;   // player 1 ke scores ka increment
		   int t2= 0;  // player 2 ke scores ka increment

			for (int i=0;i<n ;i++ ){
			int  P1 =sc.nextInt();
			int  P2 =sc.nextInt();
			t1 = t1+P1;  // 0+140 ; 140+89; 229+90; 319+112; 431+88; 519;
			t2 = t2+P2;  // 0+82 ; 82+134 ; 216+110; 326+106; 432+90; 522;
			    if(t1>t2 && t1-t2>lead) 
			    {
			      lead = t1-t2;
			      pos =1;
			    }else if(t2>t1 && t2-t1>lead){
			      lead = t2-t1;	
			      pos=2;
			    }	
			}
			System.out.print(pos+" "+lead);	
	}
}
	


