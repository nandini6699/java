import java.util.Scanner;
public class TemparatureConveterApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
		
		
		
		
		}

}
