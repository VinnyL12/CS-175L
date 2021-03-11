
public class RoachPopulation {

	private double roachPopulation;
	
	public RoachPopulation(double startingPopulation)
	{
		roachPopulation = startingPopulation;
	}
	
	public void breed()
	{
		roachPopulation = roachPopulation * 2;
	}
	
	public void spray(double sprayPercent)
	{
		roachPopulation = roachPopulation - (roachPopulation * sprayPercent);
	}
	
	public double getroaches()
	{
		return roachPopulation;
	}
	
}


