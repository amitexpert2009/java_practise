import java.util.Scanner;
class Test12 {
	public static void main(String [] args) {
	int a;
	Scanner obj = new Scanner(System.in);
	System.out.println("enter a num");
	a=obj.nextInt();
	switch(a) {
	case 1:
	System.out.println("monday");
	break;
	case 2:
	System.out.println("tuesday");
	break;
	case 3:
	System.out.println("wed");
	break;
	case 4:
	System.out.println("thurs");
	break;
	case 5:
	System.out.println("fri");
	break;
	case 6:
	System.out.println("sat");
	break;
	case 7:
	System.out.println("sun");	
	break;
 	default:
	System.out.println("invalid");
}
}
}