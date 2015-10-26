import by.gsu.epamlab.IPurchase;
import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.PurchaseFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by User on 26/10/2015.
 */
public class Runner
{
    public static void main(String[] args)
    {
        IPurchase[] purchases;


        try
        {
            Scanner scanner=new Scanner(new FileReader("src/in.txt"));
            final int PURCHASES_LENGHT=scanner.nextInt();
            purchases=new IPurchase[PURCHASES_LENGHT];
            for(int index=0;index<PURCHASES_LENGHT;index++)
            {
                purchases[index]=PurchaseFactory.getPurchase(scanner);

            }
            int maxCost=0;
            boolean flag=true;
            IPurchase maxPurchase=null;
            for (int index=0;index<purchases.length;index++)
            {
                System.out.println(purchases[index]);

                if(purchases[index].getCost()>maxCost)
                {
                    maxCost=purchases[index].getCost();
                    maxPurchase=purchases[index];
                }
                if (index!=0)
                {
                    if(!purchases[index].equals(purchases[index-1])){flag=false;}
                }

            }
            System.out.println("Max cost purchase="+maxPurchase);
            System.out.println("All purchases are equal is "+flag);

        } catch (FileNotFoundException e)
        {
            System.err.println("File not found");
        }


    }

}
