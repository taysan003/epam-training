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
                System.out.println(purchases[index]);
            }
            int maxCost=purchases[0].getCost();
            //Purchase
            for (int index=0;index<purchases.length;index++)
            {
                //if(pu)

            }

        } catch (FileNotFoundException e)
        {
            System.err.println("File not found");
        }


    }

}
