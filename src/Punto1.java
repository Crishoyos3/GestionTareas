public class Punto1 {

//    Analizar la complejidad temporal (Big O) de los siguientes fragmentos de código y justificar:
//
//    Fragmento 1
//    Complejidad :  O(n)
//    Porque el algoritmo recorre todos los elementos del array una vez.

    public static int encontrarMaximo(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


//    Fragmento 2
//    Complejidad: O(√n)
//    Porque Itera hasta la raíz cuadrada de n, ya que si hay un divisor mayor, hay uno menor.

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }



//    Fragmento 3
//    Complejidad: O(n^2)
//    Porque se utilizan dos bucles anidados que recorren todas las filas (n) y todas las columnas (m).

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

// Fragmento 4
//    Complejidad: O(log n)
//    Porque en cada iteración, el espacio de búsqueda se reduce a la mitad.

    public static int busquedaBinaria(int[] array, int objetivo) {
        int izq = 0, der = array.length - 1;
        while (izq <= der) {
            int medio = izq + (der - izq) / 2;
            if (array[medio] == objetivo) return medio;
            if (array[medio] < objetivo) izq = medio + 1;
            else der = medio - 1;
        }
        return -1;
    }
}
