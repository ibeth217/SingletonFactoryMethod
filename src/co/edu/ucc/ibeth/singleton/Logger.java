package co.edu.ucc.ibeth.singleton;

/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos - Singleton
 * Fecha: 25/02/2025
 * Descripción: Clase principal que utiliza el Singleton Logger para registrar mensajes.
 */
public class Logger {

	private static Logger instance;

    // Constructor privado para evitar instanciación externa.
    private Logger() {}

    // Método para obtener la única instancia de Logger.
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Método para registrar mensajes.
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
