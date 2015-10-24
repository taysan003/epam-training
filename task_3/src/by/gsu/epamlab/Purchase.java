package by.gsu.epamlab;

public class Purchase implements Comparable<Purchase>
{

    private final String commodity;
    private final int price;
    private int numberUnit;
    private int discount;
    private WEEK_DAY weekDay;


    public Purchase(String commodity, int price, int numberUnit, int discount, WEEK_DAY weekDay)
    {
        this.commodity = commodity;
        this.price = price;
        this.numberUnit = numberUnit;
        this.discount = discount;
        this.weekDay = weekDay;
    }
    public Purchase()
    {
        this("Somthing",0,0,0,null);
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
        int totalCost=numberUnit*price*(100-discount)/100000;
        int rest=numberUnit*price*(100-discount)%100000;

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
