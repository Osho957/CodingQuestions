package testCases;

public class Reversestring {

	public static void main(String[] args) {
		String s = "hello";
		char[] a = s.toCharArray();
		int n = s.length();
		String rev ="";
		for(int i= n-1 ; i>= 0; i--) {
			rev = rev + s.charAt(i);
		}System.out.println(rev);
	}

}
