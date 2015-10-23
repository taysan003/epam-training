package by.gsu.epamlab;

public enum Material
{
    STEEL("Steel",7850.0), COPPER("Copper",8500.0);

    private String name;
    private double density;

    Material(String name, double density)
    {
        this.name=name;
        this.density=density;
    }

    public double getDensity()
    {
        return density;
    }


    @Override
    public String toString()
    {
        return name +";"+density;
    }
}
