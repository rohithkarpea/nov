package gethub22;

public class palindrome {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int n= 12321;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=r+(sum*10);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("it is a palindrome");
		}
			else  { 
			System.out.println("it is not a palindrome");
			}
	}

}
