import java.util.Scanner;
class Test8 {
	public static void main(String [] args) {
	int a;
	Scanner obj = new Scanner(System.in);
	System.out.println("enter your marks");
	a=obj.nextInt();
		if(a>=90)
		System.out.println("A grade");
		else if(a>=75 && a<90)
		System.out.println("B grade");
		else if(a>=60 && a<75)
		System.out.println("C grade");
		else if(a>100)
		System.out.println("invalid");
		else
		System.out.println("Fail");
}
}