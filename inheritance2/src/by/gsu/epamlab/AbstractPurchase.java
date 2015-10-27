package by.gsu.epamlab;


public abstract class AbstractPurchase implements Comparable<AbstractPurchase>
{
    protected Commodity commodity;
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
    public abstract  int getCost();

}
