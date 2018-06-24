//program for "four" types of  function
import java.util.Scanner;
class FunExample {
	void sum(int a, int b) {
		//return nothing take something
		System.out.println(a+b);
	}
	int mul() {
		//return something take nothing
		Scanner obj1 = new Scanner(System.in);
		System.out.println("enter a and b for local in mul");
		int a = obj1.nextInt();
		int b = obj1.nextInt();
		return (a*b);
	}
	void sub() {
		//return nothing take nothing
		Scanner obj1 = new Scanner(System.in);
		System.out.println("enter a and b for local in subtract");
		int a = obj1.nextInt();
		int b = obj1.nextInt();
		System.out.println(a-b);
	}
	int div(int a, int b) {
		//return something take something
		System.out.println("value of divide");
		return (a/b);
	}
		public static void main(String [] args) {
		FunExample obj = new FunExample();
		Scanner obj1 = new Scanner(System.in);
		System.out.println("enter a and b");
		int a = obj1.nextInt();
		int b = obj1.nextInt();
		obj.sum(a,b);
		System.out.println(obj.mul());
		obj.sub();
		System.out.println(obj.div(a,b));
	}
	
}