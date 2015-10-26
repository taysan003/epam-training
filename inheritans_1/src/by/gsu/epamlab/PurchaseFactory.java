package by.gsu.epamlab;

import java.util.Scanner;

public class PurchaseFactory
{
    private  enum PurchaseSelect
    {SIMPLY,DISCOUNT_SUM, DISCOUNT_PERCENT }

    public static Purchase getPurchase(Scanner scanner)
    {
        String getSelect=scanner.next();
        PurchaseSelect select=PurchaseSelect.valueOf(getSelect);
        switch (select)
        {
            case SIMPLY:
            {
                return new Purchase(scanner);
            }                
            case DISCOUNT_PERCENT:
            {
                return new DiscountProcPurchase(scanner);
            }
            case DISCOUNT_SUM:
            {
                return new DiscountSumPurchase(scanner);
            }
            default:
            {
                return new Purchase();
            }

        }

    }
}
