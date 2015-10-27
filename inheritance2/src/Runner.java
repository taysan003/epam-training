import by.gsu.epamlab.*;

import java.util.Arrays;

/**
 * Created by User on 27/10/2015.
 */
public class Runner
{
    public static void main(String[] args)
    {
        final Commodity COMMODITY=new Commodity("Milk",2500);

        AbstractPurchase[] purchases={  new DiscountProcPurchase(COMMODITY,10,2.5),
                                        new DiscountProcPurchase(COMMODITY,7,10),
                                        new DiscountSumPurchase(COMMODITY,15,1000),
                                        new DiscountSumPurchase(COMMODITY,22,90),
                                        new DiscountTransportPurchase(COMMODITY,15,7000),
                                        new DiscountTransportPurchase(COMMODITY,7,15000)};

        printPurchases(purchases);
        Arrays.sort(purchases);
        System.out.println("___________");
        printPurchases(purchases);
        System.out.println("Minimum cost=" + purchases[purchases.length - 1].getCost());

        AbstractPurchase purchaseForEqual=new DiscountSumPurchase(new Commodity("",54000),1,0);

        int reqIsEqual=Arrays.binarySearch(purchases,purchaseForEqual);
        if(reqIsEqual>=0){System.out.println(purchases[reqIsEqual]);}




    }
    private static void printPurchases(AbstractPurchase[] purchases)
    {

        for (AbstractPurchase purchase:purchases)
        {
            System.out.println(purchase);
        }
    }
}
