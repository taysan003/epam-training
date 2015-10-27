package by.gsu.epamlab;

/**
 * Created by User on 27/10/2015.
 */
public class DiscountTransportPurchase extends AbstractPurchase
{
    private int discount;

    public DiscountTransportPurchase(Commodity commodity, int number, int discount)
    {
        super(commodity, number);
        this.discount = discount;
    }

    public DiscountTransportPurchase()
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
        int totalCost=(commodity.getPrice()*number-discount)/1000*1000;
        return totalCost;
    }
}
