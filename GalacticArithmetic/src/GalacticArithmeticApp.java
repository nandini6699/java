import java.util.Scanner;

public class GalacticArithmeticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two values");
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		
		System.out.println(GalacticArithmetic.galacticAddition(num1,num2));
		
		scan.close();

	}

}
