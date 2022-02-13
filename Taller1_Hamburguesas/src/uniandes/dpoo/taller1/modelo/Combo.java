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
		double precioDescuento = 0;
		int precioCombo = 0;
		int act = 0;
		for(int i=0;i<itemsCombo.size();i++)
			act = itemsCombo.get(i).getPrecio();
			precioCombo += act;
		precioDescuento = precioCombo * descuento;
		return (int)precioDescuento;
	}

	public String getNombre() {
		return nombreCombo;
	}

	public String generarTextoFactura() {
		return null;
	}
	
}
