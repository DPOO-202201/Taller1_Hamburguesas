package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;

public class Combo implements Producto {
	
	private double descuento;
	private String nombreCombo;
	private ArrayList<ProductoMenu> itemsCombo;
	
	public Combo(String nombre, double descuento) {
		this.nombreCombo = nombre;
		this.descuento = descuento;
	}
	
	public void agregarItemACombo(Producto itemCombo) {
		
	}

	@Override
	public int getPrecio() {
		return 0;
	}

	@Override
	public String getNombre() {
		return null;
	}

	@Override
	public String generarTextoFactura() {
		return null;
	}
	
}
