package Model;


public class PlatformaCargo extends AbstractCargo
{
    private final static String NAME="Platform";

    public PlatformaCargo( double weight)
    {
        super(NAME, weight);
    }

    public PlatformaCargo()
    {
        super();
    }

    public double getWeight()
    {
        return weight;
    }
}
