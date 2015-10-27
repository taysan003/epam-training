package by.gsu.epamlab;


public abstract class AbstractPurchase implements Comparable<AbstractPurchase>
{
    protected final Commodity commodity;
    protected int number;

    public AbstractPurchase()
    {
        this(null,0);
    }

    public AbstractPurchase(Commodity commodity, int number)
    {
        this.commodity = commodity;
        this.number = number;
    }

    public Commodity getCommodity()
    {
        return commodity;
    }


    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public abstract  int getCost();

    public abstract String getStringDiscount();

    @Override
    public int compareTo(AbstractPurchase purchase)
    {
        return purchase.getCost()-this.getCost();
    }

    @Override
    public String toString()
    {
        return  number +";"+getStringDiscount()+";" +getCost();
    }


}
