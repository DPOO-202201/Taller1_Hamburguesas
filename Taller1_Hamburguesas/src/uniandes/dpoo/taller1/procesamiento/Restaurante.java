package uniandes.dpoo.taller1.procesamiento;

import java.util.ArrayList;

import uniandes.dpoo.taller1.modelo.Combo;
import uniandes.dpoo.taller1.modelo.Ingrediente;
import uniandes.dpoo.taller1.modelo.Pedido;
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
	

}
