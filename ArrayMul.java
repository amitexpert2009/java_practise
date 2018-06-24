//matrix multiply
//matrix addition
import java.util.Scanner;
class ArrayMul{
	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		System.out.print("enter for array 1");
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++){
				a[i][j] = obj.nextInt();
			}
		}
		System.out.print("enter for array 2");
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++){
				b[i][j] = obj.nextInt();
			}
		}
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++){
				c[i][j]=a[i][j]*b[i][j];
			}	
		//use another logic for multiply
		
		
		
		
		
		
		
		
			
		}
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++){
			System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
	
	
	}
}