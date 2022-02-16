package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto {
	
	private ProductoMenu base;
	private ArrayList<Ingrediente> agregados;
	private ArrayList<Ingrediente> eliminados;
	
	public ProductoAjustado(ProductoMenu base) {
		this.base = base;
		agregados = new ArrayList<Ingrediente>();
		eliminados = new ArrayList<Ingrediente>();
		
	}

	public int getPrecio() {
		return base.getPrecio();
	}

	public String getNombre() {
		return base.getNombre();
	}
	
	public void agregarIngrediente(Ingrediente ingrediente) {
		agregados.add(ingrediente);
	}
	
	public void eliminarIngrediente(Ingrediente ingrediente) {
		eliminados.add(ingrediente);
	}

	public String generarTextoFactura() {
		return base.generarTextoFactura();
	}

}
