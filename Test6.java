//even - odd
import java.util.Scanner;
class Test6 {
	public static void main(String [] args) {
		int a;
		Scanner obj =new Scanner (System.in);
		System.out.println("enter your num");
		a = obj.nextInt();
		if(a%2 == 0)
		System.out.println("num is even");
		else
		System.out.println("num is odd");
}
}