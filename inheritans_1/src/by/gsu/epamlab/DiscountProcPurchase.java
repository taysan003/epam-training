package by.gsu.epamlab;

import java.util.Scanner;

public class DiscountProcPurchase extends Purchase
{
    private double discount;
    private final static int DISCOUNT_RANGE=10;

    public DiscountProcPurchase(String commodity, int price, int number, int discount)
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
        discount=scanner.nextInt();
    }

    @Override
    public int getCost()
    {
        int number = getNumber();
        int totalCost;
        if (number > DISCOUNT_RANGE)
        {
            totalCost = (int)(super.getCost() * (1 - discount / 100));
        }
        else
        {
            totalCost=super.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString()
    {
        return fieldToString()+ ";"+discount +";"+getCost();

    }
}
