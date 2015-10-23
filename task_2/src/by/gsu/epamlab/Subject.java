package by.gsu.epamlab;

public class Subject {
	
	private final String name;
	private Material material;
	private double volume;
	
	
	public Subject() {
		this("Something",null,0);
	}
	
	public Subject(final String name, Material material, double volume) {
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
		double subjectMass=volume*material.getDensity();
		return subjectMass;
		
	}

	@Override
	public String toString() {
		
		return name+";"+
				material+";"+
				String.format("%1$.2f", volume)+ ";"+
				String.format("%1$.1f", getMass());
		
	}
	

}
