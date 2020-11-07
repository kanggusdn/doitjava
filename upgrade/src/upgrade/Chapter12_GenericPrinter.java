package upgrade;

public class Chapter12_GenericPrinter<T extends Chapter12_Material> {
	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}

	public T getMaterial() {
		return material;
	}

	public String toString() {
		return material.toString();
	}

	public void printing() {
		material.doPrinting();
	}
}
