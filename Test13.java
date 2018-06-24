import java.util.Scanner;
class Test13 {
	public static void main(String [] args) {
	int a;
	Scanner obj = new Scanner(System.in);
	System.out.println("enter a char");
	a=obj.nextLine().charAt(0);
	switch(a) {
	case 'm':
	System.out.println("monday");
	break;
	case 't':
	System.out.println("tuesday");
	break;
	case 'w':
	System.out.println("wed");
	break;
	case 'T':
	System.out.println("thurs");
	break;
	case 'f':
	System.out.println("fri");
	break;
	case 's':
	System.out.println("sat");
	break;
}
}
}