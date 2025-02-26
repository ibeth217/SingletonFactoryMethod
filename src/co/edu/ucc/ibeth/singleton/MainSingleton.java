package co.edu.ucc.ibeth.singleton;

import java.util.Base64;

public class MainSingleton {

	public static void main(String[] args) {
        // Uso del Singleton Logger
        Logger logger1 = Logger.getInstance();
        logger1.log("Inicio de sesión");

        Logger logger2 = Logger.getInstance();
        logger2.log("Transacción realizada");

        // Al final, se muestra la identidad codificada en Base64
        System.out.println("Identidad: " + getIdentidad());
    }

    /**
     * Retorna el nombre completo del autor codificado en Base64.
     * Reemplaza "Tu Nombre Completo" con tu nombre real.
     */
    public static String getIdentidad() {
        String nombreCompleto = "Ibeth Leonor Pacheco de la Hostia";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes());
    }
}
