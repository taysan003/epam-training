package by.gsu.epamlab;

/**
 * Created by User on 18.10.2015.
 */
public class BuisnessTrip
{
    private String emploeyee;
    private int transportExpense;
    private int dayOfTrip;
    private final int ALLOWANCE_RATE_PER_DAY=50000;

    public BuisnessTrip(String emploeyee, int transportExpense, int dayOfTrip)
    {
        this.emploeyee = emploeyee;
        this.transportExpense = transportExpense;
        this.dayOfTrip = dayOfTrip;

    }

    public BuisnessTrip()
    {

    }

    public String getEmploeyee()
    {
        return emploeyee;
    }

    public void setEmploeyee(String emploeyee)
    {
        this.emploeyee = emploeyee;
    }

    public int getTransportExpense()
    {
        return transportExpense;
    }

    public void setTransportExpense(int transportExpense)
    {
        this.transportExpense = transportExpense;
    }

    public int getDayOfTrip()
    {
        return dayOfTrip;
    }

    public void setDayOfTrip(int dayOfTrip)
    {
        this.dayOfTrip = dayOfTrip;
    }

    public int getTotal()
    {
        int result;
        result=ALLOWANCE_RATE_PER_DAY*dayOfTrip+transportExpense;
        return result;
    }

    public String show()
    {
        return String.format("Emploeye=%1s %nRate per day=%2$6d %nTransport=%3$6d %nDay=%4$2d  %nTotal=%5$6d %n" +
                        "______________________",
                emploeyee,ALLOWANCE_RATE_PER_DAY,transportExpense, dayOfTrip,getTotal());
    }

    @Override
    public String toString()
    {
        StringBuilder result=new StringBuilder();
        result.append(emploeyee)
                .append(";")
                .append(transportExpense)
                .append(";")
                .append(dayOfTrip)
                .append(";")
                .append(getTotal());
        return result.toString();
    }
}
