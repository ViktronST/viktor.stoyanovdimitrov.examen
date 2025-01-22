public class Examen {
    public static void main(String[] args) {

        //Paso 1. Llamar al método crearArray() guardar el array que devuelve en una variable.
        int[] array = UtilidadesExamen.crearArray();

        //Paso 2. Llamar al método mostrarArray pasando el array obtenido.
        UtilidadesExamen.mostrarArray(array);

        //Paso 3. Llamar al método calcularPromedio pasando el array obtenido y mostrar el resultado devuelto.
        double promedio = UtilidadesExamen.calcularPromedio(array);

        //Paso 4. Llamar al método encontrarExtremos pasando el array obtenido y mostrar el resultado devuelto.
        int[] extremos = UtilidadesExamen.encontrarExtremos(array);
        System.out.println("Máximo: " + extremos[0]);
        System.out.println("Mínimo: " + extremos[1]);

        //Paso 5. Llamar al método filtrarMayoresQuePromedio pasando el array obtenido y mostrar el resultado devuelto.
        int[] filtrado = UtilidadesExamen.filtrarMayoresQuePromedio(array, promedio);
        System.out.println("Promedio: " + promedio);
        System.out.println("Números mayores que el promedio: " + filtrado.length);
        UtilidadesExamen.mostrarArray(filtrado);
        
    }

}
