package Model;


public class People implements IPlace,Comparable<IPlace>
{
    final String NAME;
    final double WEIGHT;

    public People(String NAME, double WEIGHT)
    {
        this.NAME = NAME;
        this.WEIGHT = WEIGHT;
    }

    public People()
    {
        this(null,0);
    }

    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public double getWeight()
    {
        return WEIGHT;
    }

    @Override
    public String toString()
    {
        return NAME + ";" + WEIGHT;
    }

    @Override
    public int compareTo(IPlace place)
    {
        int result=0;
        if((place instanceof People))
        {
       /* if((WEIGHT-place.getWeight())>0)
        {
            result=1;
        }
        else if( (WEIGHT-place.getWeight())<0)
        {
            result=-1;
        }
        else {result=0;}*/


        return 1;
        }
        else{return -1;}
    }
}
