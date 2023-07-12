
public class TheJourneyCalculator {
	public static void main(String[] args) {
	TheJourneyCalculator journeyCalculator = new JourneyCalculator();
	double res=journeyCalculator.calculateDistance(60.0, 1.5);
	System.out.println(res);
	

	}
	
	public double calculateDistance(double speed, double time)
	{
		return speed*time;
	}

	
	}

