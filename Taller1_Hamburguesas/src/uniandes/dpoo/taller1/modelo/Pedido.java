package uniandes.dpoo.taller1.modelo;

import java.io.File;
import java.util.ArrayList;

public class Pedido {
	
	private int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	private ArrayList<Producto> itemsPedido;
	
	public Pedido(String nombreCliente, String direccionCliente) {
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	
	public void agregarProducto(Producto nuevoItem) {
		
	}
	
	private int getPrecioNetoPedido() {
		return 0;
	}
	
	private int getPrecioTotalPedido() {
		return 0;
	}
	
	private int getPrecioIVAPedido() {
		return 0;
	}
	
	private String generarTextoFactura() {
		return null;
	}
	
	public void guardarFactura(File archivo) {
		
	}

}
