import java.util.Scanner;

public class romanNumeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int number = in.nextInt();
		
		int millenia = number/1000%10;
		int centuries = number/100%10;
		int decades = number/10%10;
		int years = number/1%10;
		
		String romanNumerals = "";
		
		while (millenia >= 1)
		{
		millenia--;
		romanNumerals = romanNumerals + "M";
		}
		
		while(centuries >=1)
		{
			if(centuries==9)
			{
				centuries = centuries - 9;
				romanNumerals = romanNumerals + "CM";
			}
			else if(centuries >= 5)
			{
				centuries = centuries - 5;
				romanNumerals = romanNumerals + "D";
			}
			else if(centuries >= 5)
			{
				centuries = centuries - 4;
				romanNumerals = romanNumerals + "CD";
			}
			else
			{
				centuries--;
				romanNumerals = romanNumerals + "C";
			}
		}
		while(decades >= 1)
		{
			if(decades == 9)
			{
				decades = decades - 9;
				romanNumerals = romanNumerals + "XC";
			}
			else if(decades >= 5)
			{
				decades = decades -5;
				romanNumerals = romanNumerals + "L";
			}
			else if(centuries >= 4)
			{
				decades = decades -4;
				romanNumerals = romanNumerals + "XL";
			}
			else
			{
				decades--;
				romanNumerals = romanNumerals + "X";
			}
		}
		while(years >= 1)
		{
			if(years==9)
			{
				years = years - 9;
				romanNumerals = romanNumerals + "IX";
			}
			else if(years >= 5)
			{
				years = years - 5;
				romanNumerals = romanNumerals + "V";
			}
			else if(years >= 4)
			{
				years = years - 4;
				romanNumerals = romanNumerals + "IV";
			}
			else
			{
				years--;
				romanNumerals = romanNumerals + "I";
			}
		}
		System.out.println("The integer in Roman numerals is: " + romanNumerals);
		in.close();
	}

}
