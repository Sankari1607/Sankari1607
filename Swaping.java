package Taskprogram;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y, temp;
		Scanner Swaping = new Scanner(System.in);
		System.out.println("Enter the Value of X:"  );
		System.out.println("Enter the value of Y:"  );
		
		x = Swaping.nextInt();
		y = Swaping.nextInt();
		
		System.out.println("Before Swaping the number:"  + x+ " " + y);
		//Swapping
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After swaing:" + x+ " " + y);
		System.out.println();
		
		
	}

}
