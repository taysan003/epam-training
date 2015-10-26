
import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.PurchaseFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Runner
{
    public static void main(String[] args)
    {
        Purchase[] purchases;
        final String FILE_NAME="src/in1.txt";
        final int PURCHASES_LENGTH=6;

        try
        {
            Scanner scanner=new Scanner(new FileReader(FILE_NAME));
            purchases=new Purchase[PURCHASES_LENGTH];
            int maxCost=0;
            boolean flag=true;
            Purchase maxPurchase=null;
            for(int index=0;index<PURCHASES_LENGTH;index++)
            {
                purchases[index]=PurchaseFactory.getPurchase(scanner);

                System.out.println(purchases[index]);

                if(purchases[index].getCost()>maxCost)
                {
                    maxCost=purchases[index].getCost();
                    maxPurchase=purchases[index];
                }

                if (index!=0 && !purchases[index].equals(purchases[index-1])){flag=false;}


            }
            System.out.println("Max cost purchase="+maxPurchase);
            System.out.println("All purchases are equal is "+flag);

        } catch (FileNotFoundException e)
        {
            System.err.println("File not found");
        }


    }

}
