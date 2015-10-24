package by.gsu.epamlab;

public class Purchase implements Comparable<Purchase>
{

    public static  final String COMMODITY ="Something";
    public static final int PRICE =50000;
    private int numberUnit;
    private int discount;
    private WEEK_DAY weekDay;


    public Purchase( int numberUnit, int discount, WEEK_DAY weekDay)
    {
        this.numberUnit = numberUnit;
        this.discount = discount;
        this.weekDay = weekDay;
    }
    public Purchase()
    {
        this(0,0,null);
    }

    public int getNumberUnit()
    {
        return numberUnit;
    }

    public void setNumberUnit(int numberUnit)
    {
        this.numberUnit = numberUnit;
    }

    public int getDiscount()
    {
        return discount;
    }

    public void setDiscount(int discount)
    {
        this.discount = discount;
    }

    public WEEK_DAY getWeekDay()
    {
        return weekDay;
    }

    public void setWeekDay(WEEK_DAY weekDay)
    {
        this.weekDay = weekDay;
    }

    public int getCost()
    {
        int totalCost=numberUnit* PRICE *(100-discount)/100000;
        int rest=numberUnit* PRICE *(100-discount)%100000;

        if (rest>500)
        {
            totalCost++;
        }


        return totalCost*1000;
    }

    @Override
    public String toString()
    {
        return numberUnit +";"+
               discount +";"+
               weekDay+";"+
               getCost();
    }

    @Override
    public int compareTo(Purchase purchase)
    {
        return Integer.compare(numberUnit,purchase.getNumberUnit());

    }
}
