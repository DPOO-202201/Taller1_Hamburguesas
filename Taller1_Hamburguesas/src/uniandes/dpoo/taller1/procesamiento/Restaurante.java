package uniandes.dpoo.taller1.procesamiento;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import uniandes.dpoo.taller1.modelo.Combo;
import uniandes.dpoo.taller1.modelo.Ingrediente;
import uniandes.dpoo.taller1.modelo.Pedido;
import uniandes.dpoo.taller1.modelo.Producto;
import uniandes.dpoo.taller1.modelo.ProductoMenu;

public class Restaurante {
	
	private ArrayList<Combo> combos;
	private ArrayList<Pedido> pedidos;
	private Pedido pedidoEnCurso;
	private ArrayList<ProductoMenu> menuBase;
	private ArrayList<Ingrediente> ingredientes;
	
	public Restaurante() {
		
		combos = new ArrayList<Combo>();
		pedidos = new ArrayList<Pedido>();
		menuBase = new ArrayList<ProductoMenu>();
		ingredientes = new ArrayList<Ingrediente>();
	}
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) {
		
	}
	
	public void cerrarYGuardarPedido() {
		
	}
	
	public Pedido getPedidoEnCurso() {
		return pedidoEnCurso;
	}
	
	public ArrayList<ProductoMenu> getMenuBase() {
		return menuBase;
	}
	
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	
	private void cargarIngredientes(File archivoIngredientes) 
	{
		BufferedReader br = new BufferedReader(new FileReader(archivoIngredientes));
		String linea = br.readLine();
		
		linea = br.readLine();
		while (linea != null)
		{
			String[] partes = linea.split(";");
			String nombreIngrediente = (partes[1]);
			int precio = Integer.parseInt(partes[2]);
			
			Ingrediente elIngrediente = new Ingrediente(nombreIngrediente, precio);
			ingredientes.add(elIngrediente);
			
		}
	}
	
	private void cargarMenu(File archivoMenu) 
	{
		
	}
	
	private void cargarCombos(File archivoCombos) 
	{
		
	}

}
