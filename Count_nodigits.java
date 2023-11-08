//Write a program to count number of digits in an integer

package Taskprogram;

public class Count_nodigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0, num = 987565385;
		
		while( num  > 
		0)
		{
			//num/=10;
			num =num /10;
			count ++;
		}
		System.out.println("The Count of Number of digits in Integer is: " + count);
				
	}
	

}
