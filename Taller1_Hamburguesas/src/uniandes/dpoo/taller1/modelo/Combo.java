package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;

public class Combo implements Producto {
	
	private double descuento;
	private String nombreCombo;
	private ArrayList<ProductoMenu> itemsCombo;
	
	public Combo(String nombre, double descuento) {
		this.nombreCombo = nombre;
		this.descuento = descuento;
		itemsCombo = new ArrayList<ProductoMenu>();
	}
	
	public void agregarItemACombo(Producto itemCombo) {
		
		itemsCombo.add((ProductoMenu)itemCombo);
	}

	public int getPrecio() {
		return 0;
	}

	public String getNombre() {
		return null;
	}

	public String generarTextoFactura() {
		return null;
	}
	
}
