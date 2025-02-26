package co.edu.ucc.ibeth.pensión;

public class Ley100PensionCalculator implements PensionCalculator{

	// Ley 100: Pensión = promedio de salarios (últimos 10 años)

	private double[] salarios;

    // Se reciben uno o más salarios para calcular el promedio
    public Ley100PensionCalculator(double... salarios) {
        this.salarios = salarios;
    }

    @Override
    public double calcularPension() {
        double suma = 0;
        for (double s : salarios) {
            suma += s;
        }
        return suma / salarios.length;
    }
	
}
