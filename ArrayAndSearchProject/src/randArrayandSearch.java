import java.util.Random;

import java.util.Arrays;

public class randArrayandSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		int[]list = new int[50];
		int count1 = 1;
		int count2 = 0;
		int frequentNum = list[0];
		
		System.out.println("Array: ");
		for(int i = 0; i < list.length; i++)
		{
			list[i] = rand.nextInt(25) + 1;
			System.out.print(list[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		Arrays.sort(list);
		System.out.println("Sorted Array: ");
		for(int p = 0; p < list.length; p++)
		{
			System.out.print(list[p] + ", ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("smallest number: " + list[0]);
		System.out.println("greatest number: " + list[49]);
		System.out.println("The product of the smallest and greatest number is: " + list[0] * list[49]);
		
		for(int i = 1; i < list.length; i++)
		{
			if(list[i] == list[i-1])
			{
				count1++;
			}
			else
			{
				if (count1 > count2)
				{
					count2 = count1;
					frequentNum = list[i-1];
				}
				count1 = 1;
			}
		}
		System.out.println("The most frequent number is " + frequentNum + " and it appears " + count2 + " times");
	}
}
