package by.gsu.epamlab;

import java.util.Scanner;

public class DiscountSumPurchase extends Purchase
{
    private int discount;

    public DiscountSumPurchase(String commodity, int price, int number, int discount)
    {
        super(commodity, price, number);
        this.discount = discount;
    }

    public DiscountSumPurchase()
    {
        super();
        this.discount = 0;
    }

    public DiscountSumPurchase(Scanner scanner)
    {
        super(scanner);

        discount=scanner.nextInt();
    }

    @Override
    public int getCost()
    {
        return (getPrice()-discount)*getNumber();
    }


    protected String fieldToString()
    {
        return super.fieldToString()+";"+discount;
    }
}
