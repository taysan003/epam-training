package by.gsu.epamlab;

import java.util.Scanner;

public class DiscountNumPurchase extends Purchase
{
    private int discount;

    public DiscountNumPurchase(String commodity, int price, int number, int discount)
    {
        super(commodity, price, number);
        this.discount = discount;
    }

    public DiscountNumPurchase()
    {
        super();
        this.discount = 0;
    }

    public DiscountNumPurchase(Scanner scanner)
    {
        super(scanner);
        discount=scanner.nextInt();
    }

    @Override
    public int getCost()
    {
        return (getPrice()-discount)*getNumber();
    }
}
