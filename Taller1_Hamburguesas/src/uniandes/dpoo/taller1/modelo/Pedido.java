package uniandes.dpoo.taller1.modelo;

import java.io.File;
import java.util.ArrayList;

public class Pedido {
	
	private static int numeroPedidos = 0;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	private ArrayList<Producto> itemsPedido;
	
	public Pedido(String nombreCliente, String direccionCliente) {
		numeroPedidos++;
		idPedido = numeroPedidos;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		itemsPedido = new ArrayList<Producto>();
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	
	public void agregarProducto(Producto nuevoItem) {
		itemsPedido.add(nuevoItem);
	}
	
	private int getPrecioNetoPedido() {
		int precioNeto = 0;
		int act = 0;
		for(int i=0;i<itemsPedido.size();i++)
			act = itemsPedido.get(i).getPrecio();
			precioNeto += act;
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

}
