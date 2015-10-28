package Model;


import java.util.Arrays;

public class Steem
{
    public final static double LOADING_CAPACITY=1000;
    private IPlace[] listPlace;

    public Steem(IPlace[] listPlace)
    {
        this.listPlace = listPlace;
    }

    public Steem()
    {
        this(null);
    }

    public IPlace[] getListPlace()
    {
        return listPlace;
    }

    public boolean isExceededCapacity()
    {
        double totalWeight=0;
        for(IPlace place: listPlace)
        {
            totalWeight+=place.getWeight();
        }
        if((LOADING_CAPACITY-totalWeight)>=0){return true;}
        else {return false;}
    }

    @Override
    public String toString()
    {
        StringBuilder result=new StringBuilder();
        for(IPlace place:listPlace)
        {
            result.append(place).append("\n");
        }
        return  result.toString();
    }
}
