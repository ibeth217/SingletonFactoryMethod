package co.edu.ucc.ibeth.pensión;

public class Ley78PensionCalculator implements PensionCalculator{

	private double salario;

    public Ley78PensionCalculator(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPension() {
        return salario * 15;
    }
}
