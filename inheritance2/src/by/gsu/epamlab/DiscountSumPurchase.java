package by.gsu.epamlab;


public class DiscountSumPurchase extends AbstractPurchase
{
    private int discount;

    public DiscountSumPurchase(Commodity commodity, int number, int discount)
    {
        super(commodity, number);
        this.discount = discount;
    }

    public DiscountSumPurchase()
    {
        this(null,0,0);
    }

    public int getDiscount()
    {
        return discount;
    }

    public void setDiscount(int discount)
    {
        this.discount = discount;
    }

    @Override
    public String getStringDiscount()
    {
        return Integer.toString(discount);
    }

    @Override
    public int getCost()
    {
        int totalcost=number*(commodity.getPrice()-discount)/1000*1000;
        return totalcost;
    }


}
