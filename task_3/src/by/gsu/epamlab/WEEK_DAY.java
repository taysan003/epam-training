package by.gsu.epamlab;

public enum WEEK_DAY
{
    SUNDAY(0) ,  MONDAY (1), TUESDAY(2),WEDNESDAY(3),THIRSDAY(4),FRIDAY(5),SATURDAY(6);

    private int day;

    WEEK_DAY(int i)
    {
        day=i;
    }

    public String getDay(int day)
    {
        return this.name().toLowerCase();
    }
    public void setDay(int day)
    {
        this.day=day;
    }

    @Override
    public String toString()
    {
        return this.name().toLowerCase();
    }
}
