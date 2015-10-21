package by.gsu.epamlab;

public class Material {

	private final String name;
	private final double density;
	
	
	public Material(final String name, final double density) {
		super();
		this.name = name;
		this.density = density;
	}


	public Material() {
		super();
		this.name = "Something";
		this.density = 0;
	}


	public String getName() {
		return name;
	}


	public double getDensity() {
		return density;
	}


	@Override
	public String toString() {
		
		return name+";"+String.format("%1$.1f", density);
	}
	
	
	
}
