import java.util.Scanner;
public class TimeConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int minutes=scan.nextInt();
		System.out.println(TimeConverter.convertToHours( minutes));
		scan.close();
	
	}

}
