//diamond(pyramid)
import java.util.Scanner;
class Diamond {
	public static void main(String [] args) {
		int i,j,n=3,m=0,q; 
		for (i=1;i<=5;i++) {
			q=i<=n ? m++:m--;
			for (j=1;j <= 5 ; j++) {
				if(j>=4-m && j<=2+m)
				System.out.print("*");
				else
				System.out.print(" ");

						}
		System.out.println("");
				}
}

}