//sum of reverse
import java.util.Scanner;
class ReverseSum {
	public static void main(String [] args) {
	int a,b,c=0;
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
	while (a!=0) {
	b=a%10;
	c=c+b;
	a=a/10;
	}
	System.out.println(c);
}
}