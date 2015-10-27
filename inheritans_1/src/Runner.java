
import by.gsu.epamlab.PurchaseFactory;
import by.gsu.epamlab.Purchase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Runner
{
    public static void main(String[] args)
    {
        final String FILE_NAME="src/in.txt";
        final int PURCHASES_LENGTH=6;

        Scanner scanner=null;
        try
        {
            scanner=new Scanner(new FileReader(FILE_NAME));
            Purchase[] purchases=new Purchase[PURCHASES_LENGTH];

            int maxCost=0;
            boolean isEqual=true;
            Purchase maxPurchase=null;

            for(int index=0;index<PURCHASES_LENGTH;index++)
            {

                Purchase newPurchase=PurchaseFactory.getPurchase(scanner);


                System.out.println(newPurchase);

                if(newPurchase.getCost()>maxCost)
                {
                    maxCost=newPurchase.getCost();
                    maxPurchase=newPurchase;
                }

                purchases[index]=newPurchase;

                if (isEqual){isEqual=newPurchase.equals(purchases[0]);}



            }
            System.out.println("Max cost purchase="+maxPurchase);
            System.out.println("All purchases are equal is "+isEqual);

        } catch (FileNotFoundException e)
        {
            System.err.println("File not found");
        }
        finally
        {
            if(scanner!=null){scanner.close();}
        }


    }

}
