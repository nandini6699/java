import java.util.Scanner;

public class TheStringJoinerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			String str1=scan.next();
			String str2=scan.next();
			String res=TheStringJoiner.joinStrings(str1,str2);
			System.out.println(res);  
			}

	}


