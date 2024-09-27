package supermercado;

import interfaz.productos.ConDescuento;

public class Detergente extends Producto implements ConDescuento {

	private double descuento;

	public Detergente(String marca, double precio) {
		super(marca, precio);
		this.descuento = 0;
	}

	@Override
	public void setDescuento(double des) {
		this.descuento = des;

	}

	@Override
	public double getDescuento() {
		return (1 - (this.descuento / 100));
	}

	@Override
	public double getPrecioDescuento() {
		return super.getPrecio() * this.getDescuento();
	}

	@Override
	public String toString() {
		return super.toString() + " Precio con descuento: " + this.getPrecioDescuento();
	}

}
