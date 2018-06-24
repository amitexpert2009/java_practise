import java.util.Scanner;
class Radius {
	public static void main(String [] args) {
		float area=0,radius;
		Scanner a= new Scanner(System.in);
		System.out.println("enter rad");
		radius=a.nextFloat();
		area=3.14f*radius*radius;
		System.out.println("enter your circle"+area);
}
}