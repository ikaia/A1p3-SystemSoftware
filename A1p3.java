
import java.util.Random;

public class A1p3 {

	public static void main(String[] args){
		if(args.length == 2){
			Random random= new Random(); //Random numbers

			int m= Integer.parseInt(args[0]); //Adding Integer.parseInt
			int n= Integer.parseInt(args[1]); //Adding Integer.parseInt

			int [][] firstMatrix= new int[m][n]; //FirstMatrix Array
			int [][] reverseMatrix= new int[m][n]; //Reverse Matrix Array
			for (int r=0; r<m; r++ ) {
				for (int i=0; i<n; i++) {
					firstMatrix[r][i]= -30 + random.nextInt(71);
					reverseMatrix[m-1-r][i]= firstMatrix[r][i];
				}
			}

			System.out.println("First matrix:"); //Print out first matrix
			for (int r=0; r<m; r++ ) {
				for (int i=0; i<n; i++) {
					System.out.print(firstMatrix[r][i]+"\t");
				}
				System.out.println();
			}

			System.out.println("\nSecond matrix:"); //Print out second matrix
			for (int r=0; r<m; r++ ) {
				for (int i=0; i<n; i++) {
					System.out.print(reverseMatrix[r][i]+"\t");
				}
				System.out.println();
			}

		}
		else {
			System.out.println("Must input to the command line arguments");
		}}
}

