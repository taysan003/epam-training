package Model;


public abstract class AbstractCargo implements Comparable <IPlace>,IPlace
{
    protected  String name;
    protected double weight;

    public AbstractCargo(String name, double weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public AbstractCargo()
    {
        this(null,0);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int compareTo(IPlace place)
    {
        if(place instanceof AbstractCargo)
        {
            return name.compareTo(place.getName());
        }
        else{return 1;}
    }

    @Override
    public String toString()
    {
        return name + ";" + String.format("%1$.2f",weight);
    }
}
