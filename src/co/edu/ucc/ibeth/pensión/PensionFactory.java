package co.edu.ucc.ibeth.pensión;

public class PensionFactory {

	 // params contendrá los parámetros necesarios para cada ley.
    public static PensionCalculator crearPensionCalculator(String ley, Object... params) {
        switch(ley.toLowerCase()) {
            case "ley 78":
                // Se espera: salario (Double)
                return new Ley78PensionCalculator((double) params[0]);
            case "ley 86":
                return new Ley86PensionCalculator((double) params[0]);
            case "ley 98":
                return new Ley98PensionCalculator((double) params[0]);
            case "ley 100":
                // Se espera uno o más salarios para calcular el promedio.
                double[] salarios = new double[params.length];
                for (int i = 0; i < params.length; i++) {
                    salarios[i] = (double) params[i];
                }
                return new Ley100PensionCalculator(salarios);
            case "ley petro":
                // Se esperan: salario (Double), salarioMinimo (Double) y esMenor (Boolean)
                return new LeyPetroPensionCalculator((double) params[0], (double) params[1], (boolean) params[2]);
            default:
                return null;
        }
    }
}
