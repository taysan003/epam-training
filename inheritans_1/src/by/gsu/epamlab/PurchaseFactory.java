package by.gsu.epamlab;

import java.util.Scanner;

/**
 * Created by User on 26/10/2015.
 */
public class PurchaseFactory
{
    private  enum PurchaseSelect
    {SIMPLY,DISCOUNT_SUM, DISCOUNT_PERCENT }

    public static IPurchase getPurchase(Scanner scanner)
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
                return new DiscountNumPurchase(scanner);
            }
            default:
            {
                return new Purchase();
            }

        }

    }
}
