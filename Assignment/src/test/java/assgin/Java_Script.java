package assgin;

import java.util.Scanner;

public class Java_Script 
{
	static String temp;
	static String wind;
	static String pressure;
	static String value;
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the valid input");
			System.out.println("1 to check the temp");
			System.out.println("2 to check the wind");
			System.out.println("3 to check the pressure");
			System.out.println("0 to terminate");
			int no=scanner.nextInt();
			switch(no) 
			{
			case 1:System.out.println("temp valid date");
			Scan();
			Get_Op.fetch_temp(value);
			break;
			case 2:System.out.println("wind valid date");
			Scan();
			Get_Op.fetch_wind(value);
			break;
			case 3:System.out.println("pressure valid date");
			Scan();
			Get_Op.fetch_pressure(value);
			break;
			case 0:System.out.println("terminate");
			System.exit(0);
			break;

			default:System.err.println("invalid date");
			break;
			}
		}
	}
	public static void Scan()
	{
		Scanner e=new Scanner(System.in);
		System.out.print("enter the date");
		String sc=e.nextLine();
		Scanner scanner = new Scanner(sc);
		scanner.useDelimiter(",");
		while (scanner.hasNext()) 
		{
			value = scanner.next();
		}	
	}
}
