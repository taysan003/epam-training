package by.gsu.epamlab;

public enum WEEK_DAY
{
    SUNDAY(0) ,  MONDAY (1), TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6);

    private int day;

    WEEK_DAY(int i)
    {
        day=i;
    }

    public static WEEK_DAY getDay(int day)
    {
        WEEK_DAY daySearch=null;
        for( WEEK_DAY weekDay:WEEK_DAY.values()   )
        {
            if(weekDay.day==day)
            {
                daySearch=weekDay;
            }

        }
        return daySearch;
    }
    public  void setDay(int day)
    {
        this.day=day;
    }

    @Override
    public String toString()
    {
        return this.name().toLowerCase();
    }
}
