package by.gsu.epamlab;

public class DiscountTransportPurchase extends AbstractPurchase
{
    private final double transport=1000;

    public DiscountTransportPurchase(Commodity commodity, int number, int discount)
    {
        super(commodity, number);

    }

    public DiscountTransportPurchase()
    {
        this(null,0,0);
    }

    public double getTransport()
    {
        return transport;
    }



    @Override
    public String getStringDiscount()
    {
        return Double.toString(transport);
    }

    @Override
    public int getCost()
    {
        int totalCost=commodity.getPrice()*number;
        totalCost+=transport/1000*1000;
        return totalCost;
    }
}
