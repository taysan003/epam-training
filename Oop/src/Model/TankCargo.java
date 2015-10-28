package Model;


public class TankCargo extends AbstractCargo
{
    private final static String NAME="Tank";
    private final static double HEIGHT=100;
    private final static double RADIUS=100;
    private final static double TANK_WEIGHT=100;
    private double density;

    public TankCargo(double density)
    {
        super(NAME, 0);
        this.density = density;
        weight=getWeight();
    }

    public TankCargo()
    {
        super();
        this.density=0;
    }

    public double getWeight()
    {
        return Math.PI*RADIUS*RADIUS*HEIGHT*density+TANK_WEIGHT;
    }
}
