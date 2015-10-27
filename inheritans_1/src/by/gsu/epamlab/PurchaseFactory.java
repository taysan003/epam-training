package by.gsu.epamlab;
import java.util.Scanner;

public class PurchaseFactory
{
    private enum PurchaseType
    {

        SIMPLY
                {
                    @Override
                     Purchase getPurchase(Scanner scanner)
                    {
                        return new Purchase(scanner);
                    }
                },
        DISCOUNT_SUM
                {
                    @Override
                     Purchase getPurchase(Scanner scanner)
                    {
                        return new DiscountSumPurchase(scanner);
                    }
                },
        DISCOUNT_PERCENT
                {
                    @Override
                     Purchase getPurchase(Scanner scanner)
                    {
                        return new DiscountProcPurchase(scanner);
                    }
                };

         abstract Purchase getPurchase(Scanner scanner);

    }

    public static Purchase getPurchase(Scanner scanner)
    {
        String readType=scanner.next();
        PurchaseType purchaseType= PurchaseType.valueOf(readType);
        return purchaseType.getPurchase(scanner);
    }
}
