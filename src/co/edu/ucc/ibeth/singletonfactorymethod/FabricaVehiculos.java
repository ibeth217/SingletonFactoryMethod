package co.edu.ucc.ibeth.singletonfactorymethod;


public class FabricaVehiculos {
	// Fábrica para crear vehículos
	public static Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("electrico")) {
            return new CarroElectrico();
        } else if (tipo.equalsIgnoreCase("gasolina")) {
            return new CarroGasolina();
        }
        return null;
    }
}
