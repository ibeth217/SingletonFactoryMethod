package co.edu.ucc.ibeth.pensión;

public class Ley86PensionCalculator implements PensionCalculator{
	// Ley 86: Pensión = salario * 5

	private double salario;

    public Ley86PensionCalculator(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPension() {
        return salario * 5;
    }
}
