import java.util.Scanner;
class Test7 {
	public static void main(String [] args) {
	int a,b,c;
	Scanner obj = new Scanner(System.in);
	System.out.println("enter 1 num");
	a=obj.nextInt();
	System.out.println("enter 2 num");
	b=obj.nextInt();
	System.out.println("enter 3 num");
	c=obj.nextInt();
		if(a>b)
		System.out.println("a is grtr and value is"+a);
		else if(b>c)
		System.out.println("b is grtr and value is"+b);
		else if(a==b && b==c)
		System.out.println("equal");
		else
		System.out.println("c is grtr and value is"+c);
}
}