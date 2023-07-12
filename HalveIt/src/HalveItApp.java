import java.util.Scanner;
public class HalveItApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		double num=scan.nextDouble();
		
		System.out.printf("%.2f",HalveIt.halveTheNumber(num));
		
		scan.close();
	}

}
