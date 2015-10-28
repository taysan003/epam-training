package Model;


public class ContainerCargo extends AbstractCargo
{
    private final static String NAME="Container";
    private final static double HEIGHT =100;
    private final static double LENGTH =100;
    private final static double WIDTH =100;
    private final static double CONTAINER_WEIGHT =100;
    private double density;

    public ContainerCargo(double density)
    {
        super(NAME, 0);
        this.density = density;
        weight=getWeight();
    }

    public ContainerCargo()
    {
        super();
        this.density=0;
    }

    public double getWeight()
    {
        return HEIGHT * LENGTH * WIDTH *density+ CONTAINER_WEIGHT;
    }
}
