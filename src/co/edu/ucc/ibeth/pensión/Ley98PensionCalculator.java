package co.edu.ucc.ibeth.pensión;

public class Ley98PensionCalculator implements PensionCalculator {

	// Ley 98: Pensión = salario * 2.5
	 private double salario;

	    public Ley98PensionCalculator(double salario) {
	        this.salario = salario;
	    }

	    @Override
	    public double calcularPension() {
	        return salario * 2.5;
	    }
}
