package Taskprogram;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 26;
		Boolean flag = false;
		
		for(int i =2; i<=num /2; ++i)
		{
			if (num% i == 0) {
			
				flag = true;
			break;
			
		}}
		
		if(!flag)
		
			System.out.println(num + " : is a Prime number");
		
		else
		
			System.out.println(num + "  : is not a Prime number");
		
	}}
