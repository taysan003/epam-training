import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.WEEK_DAY;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {

	private static final String COMMODITY="Something";
	private static final int PRICE=50000;
	final static String FILE_PATH="src/in.txt";
	private static Purchase[] purchases=null;

	public static void main(String[] args) {

		Scanner scanner=null;

		try
		{
			scanner=new Scanner(new FileReader(FILE_PATH));

			final int PURCHASE_NUMBER = getPurchases(scanner);

			printPurchases();

			int totalCost=0;
			int totalCostMonday=0;
			int maxCost=0;
			int dayMaxCost=0;

			for(Purchase purchase:purchases)
			{
				totalCost+=purchase.getCost();

				if(purchase.getWeekDay()==1)
				{
					totalCostMonday+=purchase.getCost();
				}
				if(purchase.getCost()>maxCost)
				{
					dayMaxCost=purchase.getWeekDay();
				}

			}
			Arrays.sort(purchases);

			printPurchases();

			int reqPurchase=Arrays.binarySearch(purchases,new Purchase("",0,5,0,0));

			if (PURCHASE_NUMBER!=0)
			{
				double meanCost=(double)(totalCost/PURCHASE_NUMBER);
				WEEK_DAY weekDay=WEEK_DAY.SATURDAY;

				printResult(String.format("%1$.2f",meanCost), weekDay.getDay(dayMaxCost),
						Integer.toString(totalCostMonday), Integer.toString(reqPurchase));
			}
			else
			{
				printResult("0", "is null","0", " not found");
			}


		}
		catch (FileNotFoundException e)
		{
			System.err.println("File not found");
			e.printStackTrace();
		}
		finally
		{
			scanner.close();
		}


	}

	private static void printResult(String meanCost, String dayMaxCost, String totalCostMonday, String reqPurchase)
	{
		System.out.println("Mean cost= " + meanCost);
		System.out.println("The total cost in Monday = " + totalCostMonday);
		System.out.println("The day with the maximum cost purchase " + dayMaxCost);
		System.out.println("Required purchase is " + reqPurchase);
	}

	private static int getPurchases(Scanner scanner)
	{
		final  int PURCHASE_NUMBER=scanner.nextInt();
		purchases=new Purchase[PURCHASE_NUMBER];
		int index=0;
		while (scanner.hasNext())
        {
            int numberUnit=scanner.nextInt();
            int discount=scanner.nextInt();
            int weekDay=scanner.nextInt();
            purchases[index]=new Purchase(COMMODITY,PRICE,numberUnit,discount,weekDay);
            index++;
        }
		return PURCHASE_NUMBER;
	}

	private static void printPurchases()
	{
		System.out.println("Commodity name "+COMMODITY +", price="+PRICE);
		for (Purchase purchase:purchases)
		{
			System.out.println(purchase.toString());
		}


	}



}


