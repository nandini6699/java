import java.util.Scanner;
public class PowerOfSquares {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter power of squares");
	int num=scan.nextInt();
    System.out.println(PowerOfSquares(num));
	
	
	}
	public static  int PowerOfSquares(int num) 
	{
		
		return num*num;
	}
}

