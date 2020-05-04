package com.git;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,c=0;
		for(i=1;i<=10;i++)
		{
			if(i%2!=0)
				c++;
		}
		System.out.println("Count of odd numbers between 1 to 10 is "+c);
	}

}
