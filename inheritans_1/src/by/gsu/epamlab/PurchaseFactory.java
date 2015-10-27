package by.gsu.epamlab;
import java.util.Scanner;

public enum PurchaseFactory
{

        SIMPLY
            {
                @Override
               public Purchase getPurchase(Scanner scanner)
                {
                    return new Purchase(scanner);
                }
            },
        DISCOUNT_SUM
                {
                    @Override
                    public Purchase getPurchase(Scanner scanner)
                    {
                        return new DiscountSumPurchase(scanner);
                    }
                },
        DISCOUNT_PERCENT
                {
                    @Override
                   public Purchase getPurchase(Scanner scanner)
                    {
                        return new DiscountProcPurchase(scanner);
                    }
                };
       public abstract Purchase getPurchase(Scanner scanner);


}
