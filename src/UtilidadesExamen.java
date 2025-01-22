import java.util.Scanner;

public class UtilidadesExamen {

    //Crear un array y llenarlo con números del usuario
    //Escribe una función crearArray que:
    //     ◦ Pida al usuario el tamaño del array (entre 1 y 10).
    //     ◦ Llene el array con números introducidos por el usuario.
    //     ◦ Devuelva el array.
    public static int[] crearArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array (entre 1 y 10): ");
        int tamano = scan.nextInt();        
        int[] array = new int[tamano];
       
        while (tamano < 1 || tamano > 10){
            System.out.println("Introduce un tamaño válido (entre 1 y 10): ");
            tamano = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            System.out.println("Introduce el número " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }

        return array;
    }

    //Función mostrarArray que reciba un array lo recorra y lo imprima.
    public static void mostrarArray(int[] numeros){
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println();
    }

    //Escribe una función calcularPromedio que:
    //     ◦ Reciba un array.
    //     ◦ Calcule y devuelva el promedio de los números.
    public static double calcularPromedio(int[] numeros){
        double suma = 0;
        
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }

        return (suma / numeros.length);
    }

    //Escribe una función encontrarExtremos que:
    //     ◦ Reciba un array.
    //     ◦ Encuentre y devuelva el valor máximo y el mínimo.
    public static int[] encontrarExtremos(int[] numeros){
        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
            if (numeros[i] < minimo){
                minimo = numeros[i];
            }
        }
        
        int[] extremos = {maximo, minimo};

        return extremos;
    }

    // Escribe una función filtrarMayoresQuePromedio que:
    //     ◦ Reciba un array y el promedio calculado.
    //     ◦ Devuelva un nuevo array con los números mayores que el promedio.
    public static int[] filtrarMayoresQuePromedio(int[] numeros, double promedio){
        int contador = 0;
        
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > promedio){
                contador++;
            }
        }
       
        int[] filtrado = new int[contador];
        contador = 0;
       
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > promedio){
                filtrado[contador] = numeros[i];
                contador++;
            }
        }

        return filtrado;
    }

}
