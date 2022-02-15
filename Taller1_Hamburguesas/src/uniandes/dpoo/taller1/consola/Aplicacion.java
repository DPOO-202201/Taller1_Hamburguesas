package uniandes.dpoo.taller1.consola;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import uniandes.dpoo.taller1.procesamiento.Restaurante;

public class Aplicacion
{
	/**
	 * Ejecuta la aplicación: le muestra el menú al usuario y la pide que ingrese
	 * una opción, y ejecuta la opción seleccionada por el usuario. Este proceso se
	 * repite hasta que el usuario seleccione la opción de abandonar la aplicación.
	 */
	public void ejecutarAplicacion()
	{

		try {
			Restaurante.cargarInformacionRestaurante("data/ingredientes.txt", "data/menu.txt", "data/combos.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("\nPor favor seleccione una opcion"));
				if (opcion_seleccionada == 1)
					ejecutarMostrarCarta();
				else if (opcion_seleccionada == 2)
					ejecutarNuevoPedido();
				else if (opcion_seleccionada == 3)
					ejecutarAgregarElemento();
				else if (opcion_seleccionada == 4)
					ejecutarCerrarFactura();
				else if (opcion_seleccionada == 5)
					ejecutarConsultarID();
				else if (opcion_seleccionada == 6)
				{
					System.out.println("\nSaliendo de la aplicación...\n");
					continuar = false;
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}

	/**
	 * Muestra al usuario el menú con las opciones para que escoja la siguiente
	 * acción que quiere ejecutar.
	 */
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicacion:\n");
		System.out.println("1. Mostrar la carta");
		System.out.println("2. Crear un nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerrar un pedido y generar factura");
		System.out.println("5. Consultar un pedido por ID");
		System.out.println("6. Salir");
	}
	
	/**
	 * Carga los datos de los combos, los ingredientes y el menu
	 */

	/**
	 * Muestra el menu al usuario
	 */
	private void ejecutarMostrarCarta()
	{
		System.out.println("\n");
		Restaurante.mostrarMenu();
	}
	
	
	/**
	 * Crea un nuevo pedido
	 */
	private void ejecutarNuevoPedido()
	{
		System.out.println("\n" + "Crear nuevo pedido" + "\n");
	}

	/**
	 * Agrega un elemento a un pedido
	 */
	private void ejecutarAgregarElemento()
	{
		System.out.println("\n" + "Agregar elemento a pedido" + "\n");
	}

	/**
	 * Cierra un pedido y guarda la factura en un .txt
	 */
	private void ejecutarCerrarFactura()
	{
		System.out.println("\n" + "Cerrar pedido y generar factura" + "\n");
	}

	/**
	 * De acuerdo a un ID, consulta la informacion de un pedido
	 */
	private void ejecutarConsultarID()
	{
		System.out.println("\n" + "Consultar orden por ID" + "\n");
	}

	
	/**
	 * Este método sirve para imprimir un mensaje en la consola pidiéndole
	 * información al usuario y luego leer lo que escriba el usuario.
	 * 
	 * @param mensaje El mensaje que se le mostrará al usuario
	 * @return La cadena de caracteres que el usuario escriba como respuesta.
	 */
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Este es el método principal de la aplicación, con el que inicia la ejecución
	 * de la aplicación
	 * 
	 * @param args Parámetros introducidos en la línea de comandos al invocar la
	 *             aplicación
	 */
	public static void main(String[] args)
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();
	}

}