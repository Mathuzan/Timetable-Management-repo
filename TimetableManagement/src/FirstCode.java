import java.util.Scanner;

public class FirstCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of no 1");
		int num01 = scan.nextInt();
		
		System.out.println("Input the value of no 2");
		int num02 = scan.nextInt();
		
		int sum = num01 + num02;
		System.out.println("Print the value of sum : " + sum);
	}
}
