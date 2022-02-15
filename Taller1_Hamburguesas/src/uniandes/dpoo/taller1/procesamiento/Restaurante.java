package uniandes.dpoo.taller1.procesamiento;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import uniandes.dpoo.taller1.modelo.Combo;
import uniandes.dpoo.taller1.modelo.Ingrediente;
import uniandes.dpoo.taller1.modelo.ProductoMenu;

public class Restaurante

{

	static ArrayList<ArrayList<String[]>> dataNormal = new ArrayList<ArrayList<String[]>>();

	static ArrayList<String[]> matrizIngredientes = new ArrayList<String[]>();
	static ArrayList<String[]> matrizMenu = new ArrayList<String[]>();
	static ArrayList<String[]> matrizCombos = new ArrayList<String[]>();

	private static ArrayList<String[]> cargarArchivo(String file) throws IOException
		{
			ArrayList<String[]> matriz = new ArrayList<String[]>();
			String cadena; 
			FileReader f = new FileReader(file); 
			BufferedReader b = new BufferedReader(f); 

			while((cadena = b.readLine())!=null)
				{ 
					matriz.add(cadena.split(";"));
				} 

			b.close(); 

			return matriz;
		}

	private static void cargarIngredientesNormal(String archivoIngredientes) throws IOException
		{

			matrizIngredientes = cargarArchivo(archivoIngredientes);

		}

	private static void cargarMenuNormal(String archivoMenu) throws IOException
		{

			matrizMenu = cargarArchivo(archivoMenu);

		}

	private static void cargarCombosNormal(String archivoCombos) throws IOException
		{

			matrizCombos = cargarArchivo(archivoCombos);

		}

	//••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••

	static ArrayList<Ingrediente> matrizIngredientesClase = new ArrayList<Ingrediente>();
	static ArrayList<ProductoMenu> matrizMenuClase = new ArrayList<ProductoMenu>();
	static ArrayList<Combo> matrizComboClase = new ArrayList<Combo>();

	private static void cargarIngredientes(ArrayList<ArrayList<String[]>> data)

		{

			ArrayList<String[]> ingredientes = data.get(0);

			for(String[] linea: ingredientes)

				{

					String nombre = linea[0];
					int costoAdicional = Integer.parseInt(linea[1]);

					Ingrediente ingrediente = new Ingrediente(nombre, costoAdicional);
					matrizIngredientesClase.add(ingrediente);
					

				}

		}

	private static void cargarMenu(ArrayList<ArrayList<String[]>> data)
	
		{

			ArrayList<String[]> menu = data.get(1);

			for(String[] linea: menu)

				{

					String nombre = linea[0];
					int precioBase = Integer.parseInt(linea[1].replace("%", ""));

					ProductoMenu productoMenu = new ProductoMenu(nombre, precioBase);
					matrizMenuClase.add(productoMenu);
					

				}

		}

	private static void cargarCombos(ArrayList<ArrayList<String[]>> data)
	
		{

			ArrayList<String[]> combos = data.get(2);

			for(String[] linea: combos)

				{

					String nombre = linea[0];
					double descuento = Double.parseDouble(linea[1].replace("%", " "));
					Combo Combo = new Combo(nombre, descuento);
					matrizComboClase.add(Combo);
					

				}

		}		

	public static void cargarInformacionRestaurante(String archivoIngredientes, String archivoMenu, String archivoCombos) throws IOException

		{
			
			cargarIngredientesNormal(archivoIngredientes);
			cargarMenuNormal(archivoMenu);
			cargarCombosNormal(archivoCombos);

			dataNormal.add(matrizIngredientes);
			dataNormal.add(matrizMenu);
			dataNormal.add(matrizCombos);

			cargarIngredientes(dataNormal);
			cargarMenu(dataNormal);
			cargarCombos(dataNormal);
			
		}

	//••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••

	public static ArrayList<Ingrediente> getIngredientes()

		{

			return matrizIngredientesClase;

		}

	public static ArrayList<ProductoMenu> getMenuBase()

		{

			return matrizMenuClase;
			
		}

	public static ArrayList<Combo> getCombos()

		{

			return matrizComboClase;
			
		}		

	//••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••

	public static void mostrarMenu()
		
		{

			ArrayList<ProductoMenu> menu = getMenuBase();

			for(ProductoMenu productoMenu: menu)

				{

					System.out.print(productoMenu.getNombre() + "-" + productoMenu.getPrecio() + "\n");

				}

		}

	//••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••
		
}
