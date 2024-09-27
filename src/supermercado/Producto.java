package supermercado;

public class Producto {

	private String marca;
	private double precio;

	public Producto(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;
	}

	public String getMarca() {
		return this.marca;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Marca: " + this.marca + " -- " + "Precio: " + this.precio;
	}
}
