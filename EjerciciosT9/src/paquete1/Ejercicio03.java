package paquete1;

/*
 * @authors fERNANDO MUÑOZ Y SEBASTIÁN CALDERÓN
 */

public class Ejercicio03 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        double media;
        int suma = 0;
        int arreglos;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

        }
        media = (double) suma / arreglo.length;

        for (int i = 0; i < arreglo.length; i++) {
            arreglos = arreglo[i];
            if ((arreglos > media)) {
                elementosArribaMedia = elementosArribaMedia + 1;

            } else {

                if ((arreglos < media)) {
                    elementosAbajoMedia = elementosAbajoMedia + 1;
                }
            }

        }
        for (int i = 0; i < 1; i++) {
            System.out.printf("Los valores que estan arriba de la media son: "
                    + "%s\nLos valores que estan abajo de la media son: %s\n",
                    elementosArribaMedia,
                    elementosAbajoMedia);

        }

    }

}
