package Taskprogram;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 50;
		System.out.println("The List of Even number from 1 to " +num+ ":");
		
		for (int i=1; i<=num; i++)
		{
			if (i % 2 ==0)
			{
				System.out.print(i + " ,");
			}
		}
	}

}
