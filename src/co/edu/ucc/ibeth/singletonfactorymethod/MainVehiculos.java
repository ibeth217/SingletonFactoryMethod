package co.edu.ucc.ibeth.singletonfactorymethod;

/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos - Factory
 * Fecha: 25/02/2025
 * Descripción: Clase principal que utiliza el Factory
 */
public class MainVehiculos {
	// Uso de la fábrica en la clase principal
	 public static void main(String[] args) {
	        Vehiculo v1 = FabricaVehiculos.crearVehiculo("electrico");
	        v1.conducir();

	        Vehiculo v2 = FabricaVehiculos.crearVehiculo("gasolina");
	        v2.conducir();
	    }

}
