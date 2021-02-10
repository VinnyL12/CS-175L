import java.util.Scanner;
public class houseCode {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int Length = 0;
		int Width = 0;
		int Height = 0;
		int Windows = 0;
		int windowLength = 0;
		int windowWidth = 0;
		int Doors = 0;
		int doorLength =0 ;
		int doorWidth = 0;
		int windowSqft = 0;
		int doorSqft = 0;
		int sqftNormal = 0;
		int sqftPeak = 0;
		int sqftNormalFinal = 0;
		int sqftPeakFinal = 0;
		int sqftFinal = 0;
		double costPersqft = 0;
		double costTotal = 0;
		System.out.println("Input cost to paint square foot: ");
		costPersqft = in.nextInt();
		System.out.println("Input length of house: ");
		Length = in.nextInt();
		System.out.println("Input width of house: ");
		Width = in.nextInt();
		System.out.println("Input height of house: ");
		Height = in.nextInt();
		System.out.println("Input number of windows: ");
		Windows = in.nextInt();
		System.out.println("Input length of windows: ");
		windowLength = in.nextInt();
		System.out.println("Input width of windows: ");
		windowWidth = in.nextInt();
		System.out.println("Input number of doors: ");
		Doors = in.nextInt();
		System.out.println("Input length of door: ");
		doorLength = in.nextInt();
		System.out.println("Input width of door: ");
		doorWidth = in.nextInt();
		
		windowSqft = (windowLength * windowWidth) * Windows;
		doorSqft = (doorLength * doorWidth) * Doors;
		sqftNormal = Length * Width;
		sqftPeak = (Length * Width) + ((Length*(Height-Width)/2));
		sqftNormalFinal = sqftNormal * 2;
		sqftPeakFinal = sqftPeak * 2;
		sqftFinal = (sqftNormalFinal + sqftPeakFinal) - (doorSqft + windowSqft);
		costTotal = sqftFinal * costPersqft;
		System.out.println("Your total paintable surface area is "+sqftFinal+" square feet");
		System.out.println("Your estimate is $"+costTotal);
		in.close();
		
		
	}

}
