package kalkulator;

import java.util.Scanner;

public class menu 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Wybierz funkcje:");
		System.out.println("1. Dodawanie");
		System.out.println("2. Odejmowanie");
		System.out.println("3. Mno¿enie");
		System.out.println("4. Dzielenie");
		
		int wybor = in.nextInt();
		
		System.out.print("Podaj pierwsz¹ liczbê: ");
		double a = in.nextDouble();
		
		System.out.print("Podaj drug¹ liczbê: ");
		double b = in.nextDouble();
		
		switch(wybor)
		{
		case 1:
			System.out.println(a +" + " + b + " = " + dodaj(a,b));
			break;
		case 2:
			System.out.println(a +" - " + b + " = " + odejmij(a,b));
			break;
		case 3:
			System.out.println(a +" * " + b + " = " + razy(a,b));
			break;
		case 4:
			System.out.println(a +" / " + b + " = " + dziel(a,b));
			break;
		}
		in.close();
	}

	static double dodaj(double a, double b)
	{
		return a+b;
	}
	
	static double odejmij(double a, double b)
	{
		return a-b;
	}
	
	static double razy(double a, double b)
	{
		return a*b;
	}
	
	static double dziel(double a, double b)
	{
		return a/b;
	}
}



	
