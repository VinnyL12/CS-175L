
public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	for(int row = 1; row <= 10; row++)
	{
		for(int column=1; column <=10; column++)
		{
			System.out.print(String.format("%4d", row * column));
		}
		System.out.println();
		}
	}
}

