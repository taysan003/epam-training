import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.WEEK_DAY;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner scanner=null;
		Purchase[] purchases;
		final  String FILE_PATH="src/in.txt";

		try
		{
			scanner=new Scanner(new FileReader(FILE_PATH));

			final  int PURCHASE_NUMBER=scanner.nextInt();
			purchases=new Purchase[PURCHASE_NUMBER];
			if (PURCHASE_NUMBER>0)
			{
				int index=0;
				while (scanner.hasNext())
				{
					int numberUnit=scanner.nextInt();
					int discount=scanner.nextInt();
					int weekDay=scanner.nextInt();
					purchases[index]=new Purchase(numberUnit,discount,weekDay);
					index++;
				}
			}

			printPurchases(purchases);

			int totalCost=0;
			int totalCostMonday=0;
			int maxCost=0;
			double meanCost=0;
			WEEK_DAY dayMaxCost=null;

			for(Purchase purchase:purchases)
			{
				int cost=purchase.getCost();

				totalCost+=cost;

				if(purchase.getWeekDay()==WEEK_DAY.MONDAY)
				{
					totalCostMonday+=cost;
				}
				if(cost>maxCost)
				{
					dayMaxCost=purchase.getWeekDay();
					maxCost=cost;
				}

			}
			Arrays.sort(purchases);

			printPurchases(purchases);

			Purchase forBinarySearch=new Purchase(5,0,null);

			int resultSearch=Arrays.binarySearch(purchases,forBinarySearch);
			Purchase reqPurchase=null;
			if(resultSearch>0)
			{
				reqPurchase=purchases[resultSearch];
			}

			if (PURCHASE_NUMBER!=0)
			{
				meanCost = totalCost / purchases.length;
			}

			printResult(meanCost,dayMaxCost,totalCostMonday,reqPurchase);



		}
		catch (FileNotFoundException e)
		{
			System.err.println("File not found");
			e.printStackTrace();
		}
		finally
		{

			if (scanner!=null)
			{
				scanner.close();
			}
		}


	}

	private static void printResult(double meanCost, WEEK_DAY dayMaxCost, int totalCostMonday, Purchase reqPurchase)
	{
		System.out.println("Mean cost= " + String.format("%1$.2f",meanCost));
		System.out.println("The total cost in Monday = " + totalCostMonday);
		System.out.println("The day with the maximum cost purchase " + dayMaxCost);
		System.out.println("Required purchase is " + reqPurchase);
	}



	private static void printPurchases(Purchase[] purchases)
	{
		System.out.println("Commodity name "+Purchase.COMMODITY +", price="+Purchase.PRICE);
		for (Purchase purchase:purchases)
		{
			System.out.println(purchase.toString());
		}


	}



}


