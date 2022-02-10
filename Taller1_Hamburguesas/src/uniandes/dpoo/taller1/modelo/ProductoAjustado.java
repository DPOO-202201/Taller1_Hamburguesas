package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto {
	
	private ProductoMenu base;
	private ArrayList<Ingrediente> agregados;
	private ArrayList<Ingrediente> eliminados;
	
	public ProductoAjustado(ProductoMenu base) {
		
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
