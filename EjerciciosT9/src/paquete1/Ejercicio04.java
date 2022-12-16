package paquete1;

/*
 * @authors fERNANDO MUÑOZ Y SEBASTIÁN CALDERÓN
 */

public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        double promedio;

        for (int i = 0; i < promedios.length; i++) {
            promedio = promedios[i];
            if ((promedio >= 0) && (promedio <= 5.9)) {
                promediosCualitativos[i] = "regular";

            } else {
                if ((promedio >= 6) && (promedio <= 8.9)) {
                    promediosCualitativos[i] = "bueno";
                } else {
                    promediosCualitativos[i] = "sobresaliente";
                }

            }

        }
        for (int i = 0; i < promedios.length; i++) {
            System.out.printf("%s promedio: %.2f promedio cualitativo %s\n", estudiantes[i], promedios[i], promediosCualitativos[i]);

        }

    }
}
