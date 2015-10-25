package by.gsu.epamlab;

public enum WEEK_DAY
{
    SUNDAY ,  MONDAY , TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static WEEK_DAY getDay(int day)
    {
        WEEK_DAY daySearch=null;
        for( WEEK_DAY weekDay:WEEK_DAY.values()   )
        {
            if(weekDay.ordinal()==day)
            {
                daySearch=weekDay;
            }

        }
        return daySearch;
    }

    @Override
    public String toString()
    {
        return this.name().toLowerCase();
    }
}
