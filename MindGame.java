package game;

import java.util.Scanner;

public class MindGame 
{
public static void main(String[] args) throws InterruptedException {
		
		
		int num = 0,sum=0;
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=5;i++)
		{
		System.out.println("Enter the First number:");
		int num1=sc.nextInt();
		
		num=num1;
		Thread.sleep(2000);
		
		System.out.println("Enter the same number once again:");
		int num2=sc.nextInt();
		Thread.sleep(2000);
		
		System.out.println("My number is:"+num);
		Thread.sleep(2000);
		System.out.println("My answer is:"+(num/2));
		Thread.sleep(2000);
		System.out.println("Your answer is also:"+(num/2));
		Thread.sleep(2000);
		
		System.out.println("Let's cheek your answer:");
		Thread.sleep(2000);
		sum=num+num1+num2;
		sum=sum/2;
		System.out.println("Enter the same number which you are given in second number:");
		int num3=sc.nextInt();
		Thread.sleep(1000);
		System.out.println("Loading..............");
		Thread.sleep(5000);
		sum=sum-num3;
		System.out.println("Your answer is:"+sum);
		Thread.sleep(1000);
		System.out.println("End of the Game");
		Thread.sleep(1000);
		System.out.println("Can you play again?(y/n)");
		String playagain=sc.next();
		
		if(!playagain.equals("y"))
			break;
		}	
	}
	
	static
	{
		System.out.println("Welcome to MindGame");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
