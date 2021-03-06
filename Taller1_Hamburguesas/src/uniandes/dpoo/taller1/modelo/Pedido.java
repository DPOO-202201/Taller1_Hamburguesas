package uniandes.dpoo.taller1.modelo;

import java.io.File;
import java.util.ArrayList;

import uniandes.dpoo.taller1.consola.Aplicacion;
import uniandes.dpoo.taller1.procesamiento.Restaurante;

public class Pedido {
	
	private static int numeroPedidos = 0;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	private static ArrayList<Combo> itemsCombos;
	private static ArrayList<ProductoMenu> itemsProductos;
	
	public Pedido(String nombreCliente, String direccionCliente) {
		numeroPedidos++;
		idPedido = numeroPedidos;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		itemsCombos = new ArrayList<Combo>();
		itemsProductos = new ArrayList<ProductoMenu>();
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	
	public static void agregarAPedido(Pedido pedidoEnCurso) {
		System.out.println("Desea agregar un producto del menu o un combo?\n 1. Combo\n 2. Producto Menu");
		int opcion = Integer.parseInt(Aplicacion.input("Opcion"));
		if(opcion == 1) {
			agregarCombo();
		}
		else if (opcion == 2) {
			agregarProducto();
		}
	}
	
	public static void agregarCombo() {
		System.out.println("Lista de combos: ");
		Restaurante.mostrarCombos();
		int opcionCombo = Integer.parseInt(Aplicacion.input("Seleccione un combo"));
		ArrayList<Combo> listaCombos = Restaurante.getCombos();
		Combo comboSeleccionado = listaCombos.get(opcionCombo);
		itemsCombos.add(comboSeleccionado);
	}
	
	public static void agregarProducto() {
		System.out.println("Lista de productos: ");
		Restaurante.mostrarMenu();
		int opcionProducto = Integer.parseInt(Aplicacion.input("Seleccione un producto"));
		ArrayList<ProductoMenu> listaProductos = Restaurante.getMenuBase();
		ProductoMenu productoSeleccionado = listaProductos.get(opcionProducto);
		itemsProductos.add(productoSeleccionado);
	}
	
	private int getPrecioNetoPedido() {
		int precioNeto = 0;
		int act = 0;
		for(int i=0;i<itemsProductos.size();i++) {
			act = itemsProductos.get(i).getPrecio();
			precioNeto += act;
		}
		for(int i=0;i<itemsCombos.size();i++) {
			act = itemsCombos.get(i).getPrecio();
		    precioNeto += act;
		}
		return precioNeto;
	}
	
	private int getPrecioTotalPedido() {
		int precioTotal = getPrecioNetoPedido() + getPrecioIVAPedido();
		return precioTotal;
	}
	
	private int getPrecioIVAPedido() {
		double IVA = getPrecioNetoPedido() * 0.19;
		return (int)IVA;
	}
	
	private String generarTextoFactura() {
		return null;
	}
	
	public void guardarFactura(File archivo) {
		
	}
	
	public static void getItemsCombo(){
		for(Combo i: itemsCombos) {
			System.out.println(i.getNombre());
		}
	}
	
	public static void getItemsProductos(){
		for(ProductoMenu i: itemsProductos) {
			System.out.println(i.getNombre());
		}
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	public String getDireccionCliente() {
		return direccionCliente;
	}

}
