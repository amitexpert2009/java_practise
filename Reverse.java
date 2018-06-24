//take num from user , print reverse of numbr
import java.util.Scanner;
class Reverse {
	public static void main(String [] args) {
	int a,b,rev=0;
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
	while (a!=0) {
	b=a%10;
	rev=rev*10+b;
	a=a/10;
	}
	System.out.println(rev);
}
}