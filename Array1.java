//Array_1
import java.util.Scanner;
class Array1 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		float num[] = new float[10];
		float sum=0,avg=0 ; 
		for (int i=0;i< num.length;i++) {
				System.out.println("enter number" + (i+1) + ":");

				num[i]=in.nextFloat();
				sum=sum+num[i];
										}
		avg=sum/num.length;
		System.out.println("sum: "+sum);
		System.out.println("average: "+avg);
	
											}

			}