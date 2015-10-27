package by.gsu.epamlab;


public class DiscountProcPurchase extends AbstractPurchase
{
    private double discount;

    private final int NUMBER_FOR_DISCOUNT=15;

    public DiscountProcPurchase()
    {
       this(null,0,0);
    }

    public DiscountProcPurchase(Commodity commodity, int number, double discount)
    {
        super(commodity, number);
        this.discount = discount;
    }

    public double getDiscount()
    {
        return discount;
    }

    public void setDiscount(double discount)
    {
        this.discount = discount;
    }

    @Override
    public String getStringDiscount()
    {
        return Double.toString(discount);
    }

    @Override
    public int getCost()
    {
        int totalCost=number*commodity.getPrice();
        if(number>NUMBER_FOR_DISCOUNT)
        {
            totalCost*=(1-discount/100);
        }

        return totalCost/1000*1000;
    }

}
