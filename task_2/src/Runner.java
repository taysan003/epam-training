import by.gsu.epamlab.Material;
import by.gsu.epamlab.Subject;

public class Runner {

	public static void main(String[] args) {
		
		final Material steel=new Material("steel",7850);
		final Material copper=new Material("copper",8500);
		
		Subject wire=new Subject("wire",steel,0.03);

		System.out.println(wire);

		wire.setMaterial(copper);

		System.out.println(wire.getName()+" mass is "+wire.getMass());

	}

}
