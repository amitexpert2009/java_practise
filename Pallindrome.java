//sum of reverse
import java.util.Scanner;
class Pallindrome {
	public static void main(String [] args) {
	int a,b,d,rev=0;
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
	d=a;
	while (a!=0) {
	b=a%10;
	rev=rev*10+b;
	a=a/10;
			}
	if(d==rev)
	System.out.println("palindrome");
	else
	System.out.println("no");
	}
}