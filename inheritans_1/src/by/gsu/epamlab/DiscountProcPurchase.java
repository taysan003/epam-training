package by.gsu.epamlab;

import java.util.Scanner;

public class DiscountProcPurchase extends Purchase
{
    private double discount;
    private final int DISCOUNT_RANGE=10;

    public DiscountProcPurchase(String commodity, int price, int number, double discount)
    {
        super(commodity, price, number);
        this.discount = discount;
    }

    public DiscountProcPurchase()
    {
        super();
        this.discount = 0;
    }

    public DiscountProcPurchase(Scanner scanner)
    {
        super(scanner);
        discount=scanner.nextDouble();
    }

    @Override
    public int getCost()
    {
        int number = getNumber();
        int totalCost=super.getCost();
        if (number > DISCOUNT_RANGE)
        {
            totalCost *=  (1 - discount / 100);
        }
        return totalCost;
    }

    protected String fieldToString()
    {
        return super.fieldToString()+";"+discount;
    }
}
