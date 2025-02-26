package co.edu.ucc.ibeth.pensión;

public class LeyPetroPensionCalculator implements PensionCalculator{
	// Ley Petro: Se aplica tope y descuento para menores
	private double salario;
    private double salarioMinimo;
    private boolean esMenor;

    public LeyPetroPensionCalculator(double salario, double salarioMinimo, boolean esMenor) {
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
        this.esMenor = esMenor;
    }

    @Override
    public double calcularPension() {
        double pensionCalculada = salario;
        double tope = 3.5 * salarioMinimo;
        if (pensionCalculada > tope) {
            pensionCalculada = tope;
        }
        if (esMenor) {
            pensionCalculada *= 0.70;
        }
        return pensionCalculada;
    }
}
