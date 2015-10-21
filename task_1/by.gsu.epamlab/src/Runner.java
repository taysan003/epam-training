
import by.gsu.epamlab.BuisnessTrip;

public class Runner {

	public static void main(String[] args) {
		
		BuisnessTrip[] buisnesTrips=new BuisnessTrip[5];
		
		buisnesTrips[0]=new BuisnessTrip("Ivan Petrov",150000,5);
		buisnesTrips[1]=new BuisnessTrip("Andrey Ivanov",720000,7);
		buisnesTrips[3]=new BuisnessTrip("Kirill Antonov",350000,3);
		buisnesTrips[4]=new BuisnessTrip();

		for(BuisnessTrip buisnessTrip:buisnesTrips)
		{
			if (null!=buisnessTrip) {
				buisnessTrip.show();//TODO
			}
		}
		int maxIndex=buisnesTrips.length-1;
		buisnesTrips[maxIndex].setTransportExpense(12000);
		
		System.out.println("Duration="+(buisnesTrips[0].getDaysOfTrip()+buisnesTrips[1].getDaysOfTrip()));
		
		for(BuisnessTrip buisnessTrip:buisnesTrips)
		{
			if (null!=buisnessTrip) {
				System.out.println(buisnessTrip);
			}
		}

	}

}
