package co.edu.ucc.ibeth.pensión;

public class MainPension {

	public static void main(String[] args) {
        // Ejemplo para Ley 78: 3 personas con salario de 850,000 (se muestra un caso)
        PensionCalculator pension78 = PensionFactory.crearPensionCalculator("ley 78", 850000.0);
        System.out.printf("Pensión Ley 78: %.0f\n", pension78.calcularPension());


        // Ejemplo para Ley 86: salario de 930,000
        PensionCalculator pension86 = PensionFactory.crearPensionCalculator("ley 86", 930000.0);
        System.out.println("Pensión Ley 86: " + pension86.calcularPension());

        // Ejemplo para Ley 98: salario de 1,020,000 (para una persona, en otro caso se podría usar el doble)
        PensionCalculator pension98 = PensionFactory.crearPensionCalculator("ley 98", 1020000.0);
        System.out.println("Pensión Ley 98: " + pension98.calcularPension());

        // Ejemplo para Ley 100:
        // Caso 1: Persona con salario único de 1,200,000
        PensionCalculator pension100_1 = PensionFactory.crearPensionCalculator("ley 100", 1200000.0);
        System.out.println("Pensión Ley 100 (caso 1): " + pension100_1.calcularPension());
        // Caso 2: Persona con dos salarios para promediar: 1,230,000 y 1,300,000
        PensionCalculator pension100_2 = PensionFactory.crearPensionCalculator("ley 100", 1230000.0, 1300000.0);
        System.out.println("Pensión Ley 100 (caso 2): " + pension100_2.calcularPension());

        // Ejemplo para Ley Petro:
        // Persona con salario de 1,400,000, salario mínimo de 1,400,000 y no es menor
        PensionCalculator pensionPetro = PensionFactory.crearPensionCalculator("ley petro", 1400000.0, 1400000.0, false);
        System.out.println("Pensión Ley Petro: " + pensionPetro.calcularPension());
        // Para una persona que califique como menor
        PensionCalculator pensionPetroMenor = PensionFactory.crearPensionCalculator("ley petro", 1400000.0, 1400000.0, true);
        System.out.println("Pensión Ley Petro (menor): " + pensionPetroMenor.calcularPension());
    }
}
