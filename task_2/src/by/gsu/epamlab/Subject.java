package by.gsu.epamlab;

public class Subject {
	
	private final String name;
	private Material material;
	private double volume;
	
	
	public Subject() {
		super();
		this.name = "Something";
		this.material = null;
		this.volume = 0;
	}
	
	public Subject(final String name, Material material, double volume) {
		super();
		this.name = name;
		this.material = material;
		this.volume = volume;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getName() {
		return name;
	}

	public double getVolume() {
		return volume;
	}
	
	public double getMass() {
		double mass=volume*material.getDensity();
		return mass;
		
	}

	@Override
	public String toString() {
		
		return name+";"+
				material.getName()+";"+
				String.format("%1$.1f", material.getDensity())+";"+
				String.format("%1$.2f", volume)+ ";"+
				String.format("%1$.1f", getMass());
		
	}
	

}
