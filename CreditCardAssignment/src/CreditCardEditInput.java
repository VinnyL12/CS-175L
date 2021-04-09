import java.util.Scanner;

public class CreditCardEditInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Credit Card Number: ");
		String input = in.nextLine();
		int i = 0;
		
		while(i<input.length())
		{
			char character = input.charAt(i);
			if(character == '-' || character == ' ')
			{
				String before = input.substring(0,i);
				String after = input.substring(i+1);
				input = before + after;
			}
			else
			{
				i++;
			}
		}
		System.out.println(input);
	}
}
