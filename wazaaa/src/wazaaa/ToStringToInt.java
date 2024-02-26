package wazaaa;

import java.util.Scanner;

public class ToStringToInt {

	public static void main(String[] args) {
		StringBuilder odd = new StringBuilder();
		StringBuilder even = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any string of numbers: ");
		int num;
		try{
			num = scanner.nextInt();
		}
		catch(Exception e){
			System.out.println(" invalid opperator enter only integers ");
			return;
		}
		
		
		
		int sumEven = 0;
		int sumOdd = 0;
		
		String num1 = Integer.toString(num);
		
		
		for(int i = 0; i<num1.length(); i++)
		{
			System.out.print(num1.charAt(i));
			char num2 = num1.charAt(i);
			String num3 = String.valueOf(num2);
			int num4 = Integer.parseInt(num3);
			
			
	            if(num4 % 2 == 0)
	            {
				System.out.println(" even number ");
				even.append(num4);
				sumEven += num4;
				
			    }
	            else {
				System.out.println(" odd number ");
				odd.append(num4);
				sumOdd += num4;
	            }
		}
		System.out.println(" your even numbers sum is " +sumEven);
		System.out.println(" your odd numbers sum is " +sumOdd);
		
		System.out.println(" your odd numbers are " +odd.toString());
		System.out.println(" your even numbers are " +even.toString());
	}

}
